package solution;

import java.util.Scanner;

import template.PeriodicElement;
import template.Phase;

public class PhaseFinder extends AbstractFinder<PeriodicElement>{

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
    Boolean predicate(PeriodicElement element) {
        if(input == null){
            input = getUserInput();
        }
        //Phase 일치 여부 판단
        if(Phase.valueOf(input)==Phase.valueOf(element.getPhase())){
            return true;
        }
        
        return false;
    }
    
}