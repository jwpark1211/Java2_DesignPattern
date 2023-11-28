package solution;

import java.util.Scanner;

import template.PeriodicElement;

public class NameFinder extends AbstractFinder<PeriodicElement>{
    private Scanner sc = new Scanner(System.in);
    private String input = null;
    @Override
    String getUserInput() {
        //Name 입력
        System.out.print("[Name Finder]: Enter the name : ");
        input = sc.nextLine();
        return input;
    }
    @Override
    Boolean predicate(PeriodicElement element) {
        if(input == null){
            input = getUserInput();
        }
        //Name 일치 여부 판단
        if(input.equals(element.getName())){
            return true;
        }
        return false;
    } 
}
