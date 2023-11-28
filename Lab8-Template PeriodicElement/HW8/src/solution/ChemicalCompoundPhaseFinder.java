package solution;

import java.util.Scanner;

import template.Phase;

public class ChemicalCompoundPhaseFinder extends AbstractFinder<ChemicalCompound>{

    private Scanner sc = new Scanner(System.in);
    private String input = null;

    @Override
    String getUserInput() {
        //Phase 입력
        System.out.print("[Phase Finder]: Enter the phase(gas,liq,solid,artificial): ");
        input = sc.nextLine();
        return input;
    }

    @Override
    Boolean predicate(ChemicalCompound element) {
        if(input == null){
            input = getUserInput();
        }
        //Phase 동일한지 판단 
        if(Phase.valueOf(input)==element.getPhase()){
            return true;
        }
        
        return false;
    }
    
}