package solution;

import java.util.Scanner;

public class ChemicalCompoundNameFinder extends AbstractFinder<ChemicalCompound>{

    private Scanner sc = new Scanner(System.in);
    private String input = null;

    @Override
    String getUserInput() {
        //Name 입력받음 
        System.out.print("[Name Finder]: Enter the name : ");
        input = sc.nextLine();
        return input;
    }

    @Override
    Boolean predicate(ChemicalCompound element) {
        if(input == null){
            input = getUserInput();
        }
        //input과 element.name 동일한지 판단
        if(input.equals(element.getName())){
            return true;
        }
        
        return false;
    }
    
}
