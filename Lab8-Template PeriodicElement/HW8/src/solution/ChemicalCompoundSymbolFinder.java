package solution;

import java.util.Scanner;

public class ChemicalCompoundSymbolFinder extends AbstractFinder<ChemicalCompound>{

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
    Boolean predicate(ChemicalCompound element) {
        if(input == null){
            input = getUserInput();
        }
        //symbol 일치여부 판단
        if(input.equals(element.getSymbol())){
            return true;
        }
        
        return false;
    }
    
}