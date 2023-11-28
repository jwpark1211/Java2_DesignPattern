package solution;

import java.util.Scanner;

import template.PeriodicElement;

public class GroupFinder extends AbstractFinder<PeriodicElement>{

    private Scanner sc = new Scanner(System.in);
    private String input = null;

    @Override
    String getUserInput() {
        //group 정보 입력
        System.out.print("[Group Finder]: Enter the group(1~18): ");
        input = sc.nextLine();
        return input;
    }

    @Override
    Boolean predicate(PeriodicElement element) {
        if(input == null){
            input = getUserInput();
        }
        //group 일치 여부 판단
        if(Integer.parseInt(input)==element.getGroup()){
            return true;
        }
        
        return false;
    }
    
}