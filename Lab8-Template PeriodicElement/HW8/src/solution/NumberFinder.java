package solution;

import java.util.Scanner;

import template.PeriodicElement;

public class NumberFinder extends AbstractFinder<PeriodicElement>{

    private Scanner sc = new Scanner(System.in);
    private String input = null;

    @Override
    String getUserInput() {
        //Number 입력
        System.out.print("[Number Finder]: Enter the number : ");
        input = sc.nextLine();
        return input;
    }

    @Override
    Boolean predicate(PeriodicElement element) {
        if(input == null){
            input = getUserInput();
        }
        
        int number = Integer.parseInt(input);
        //Number 일치 여부 판단
        if(number == element.getNumber()){
            return true;
        }
        
        return false;
    }
    
}
