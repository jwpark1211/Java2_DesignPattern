package solution;

import java.util.Scanner;

import template.PeriodicElement;

public class TypeFinder extends AbstractFinder<PeriodicElement>{

    private Scanner sc = new Scanner(System.in);
    private String input = null;

    @Override
    String getUserInput() {
        //Type 입력 
        System.out.print("[Type Finder]: Enter the type: ");
        input = sc.nextLine();
        return input;
    }

    @Override
    Boolean predicate(PeriodicElement element) {
        if(input == null){
            input = getUserInput();
        }
        //Type 일치 여부 판단
        if(input.equals(element.getType())){
            return true;
        }
        
        return false;
    }
    
}