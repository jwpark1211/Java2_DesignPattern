package solution;

import java.util.Scanner;

import template.PeriodicElement;

public class WeightFinder extends AbstractFinder<PeriodicElement>{

    private Scanner sc = new Scanner(System.in);
    private String input = null;

    @Override
    String getUserInput() {
        //Weight 범위 입력 
        System.out.print("[Weight Finder]: Enter the weight(ex.50~100): ");
        input = sc.nextLine();
        return input;
    }

    @Override
    Boolean predicate(PeriodicElement element) {
        if(input == null){
            input = getUserInput();
        }
        //Weight 범위 찾기 
        String [] range = input.split("~");
        double min = Double.parseDouble(range[0]);
        double max = Double.parseDouble(range[1]);
        // 범위 안에 속하는지 판단
        if(element.getMass()>=min && element.getMass()<=max){
            return true;
        }
        
        return false;
    }
    
}