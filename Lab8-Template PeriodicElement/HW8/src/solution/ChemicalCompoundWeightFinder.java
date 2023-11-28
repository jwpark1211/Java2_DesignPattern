package solution;

import java.util.Scanner;

public class ChemicalCompoundWeightFinder extends AbstractFinder<ChemicalCompound>{

    private Scanner sc = new Scanner(System.in);
    private String input = null;

    @Override
    String getUserInput() {
        //weight 범위 입력
        System.out.print("[Weight Finder]: Enter the weight(ex.50~100): ");
        input = sc.nextLine();
        return input;
    }

    @Override
    Boolean predicate(ChemicalCompound element) {
        if(input == null){
            input = getUserInput();
        }

        //min, max weight 입력
        String [] range = input.split("~");
        double min = Double.parseDouble(range[0]);
        double max = Double.parseDouble(range[1]);

        //weight 범위 판단 
        if(element.getWeight()>=min && element.getWeight()<=max){
            return true;
        }
        
        return false;
    }
    
}