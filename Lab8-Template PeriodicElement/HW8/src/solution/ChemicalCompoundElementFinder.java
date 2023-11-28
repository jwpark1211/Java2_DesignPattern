package solution;

import java.util.Scanner;
import java.util.Set;

import template.PeriodicElement;

public class ChemicalCompoundElementFinder extends AbstractFinder<ChemicalCompound>{
    private Scanner sc = new Scanner(System.in);
    private String input = null;
    @Override
    String getUserInput() {
        //Element name 입력
        System.out.print("[Element Finder]: Enter the element : ");
        input = sc.nextLine();
        return input;
    }
    @Override
    Boolean predicate(ChemicalCompound element) {
        if(input == null){
            input = getUserInput();
        }
        //Map<PeriodicElement, int>에서 PeriodicElement만 추출 
        Set<PeriodicElement> keySet = element.getCompoundMap().keySet();
        for(PeriodicElement key : keySet){
            //Set 중 Name이 일치하는 원소 있는지 확인 
            if(input.equals(key.getName())){
                return true;
            }
        }    
        return false;
    } 
}