package solution;

import java.util.Scanner;

import template.PeriodicElement;

public class PeriodFinder extends AbstractFinder<PeriodicElement>{

    private Scanner sc = new Scanner(System.in);
    private String input = null;

    @Override
    String getUserInput() {
        //Period 입력
        System.out.print("[Period Finder]: Enter the period(1~7): ");
        input = sc.nextLine();
        return input;
    }

    @Override
    Boolean predicate(PeriodicElement element) {
        if(input == null){
            input = getUserInput();
        }
        //Period 일치 여부 판단
        if(Integer.parseInt(input)==element.getPeriod()){
            return true;
        }
        
        return false;
    }
    
}