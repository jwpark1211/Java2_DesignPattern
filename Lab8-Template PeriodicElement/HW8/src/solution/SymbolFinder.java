package solution;

import java.util.Scanner;

import template.PeriodicElement;

public class SymbolFinder extends AbstractFinder<PeriodicElement>{

    private Scanner sc = new Scanner(System.in);
    private String input = null;

    @Override
    String getUserInput() {
        //Symbol 입력
        System.out.print("[Symbol Finder]: Enter the symbol : ");
        input = sc.nextLine();
        return input;
    }

    @Override
    Boolean predicate(PeriodicElement element) {
        if(input == null){
            input = getUserInput();
        }
        //Symbol 일치 여부 판단 
        if(input.equals(element.getSymbol())){
            return true;
        }
        
        return false;
    }
    
}