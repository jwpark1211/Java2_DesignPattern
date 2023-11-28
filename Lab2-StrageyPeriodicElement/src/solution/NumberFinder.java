package solution;

import java.util.List;

import template.PeriodicElement;

public class NumberFinder implements IPeriodicElementFinder{

    @Override
    public void find(List<PeriodicElement> list) {

        System.out.println("*Number finder");
        System.out.println("Please enter [number] of PeriodicElement: ");
        
        //UserInput 객체를 통해 1~118 사이 값을 random 하게 저장
        int number = UserInput.getIntegerBetween(1, 118); 
        System.out.println("number: "+ number);

        //index 값을 이용해 element 검색 
        PeriodicElement element = list.get(number-1);

        //검색한 element의 information 출력 
        System.out.println("["+number+"] PeriodicElement Information: ");
        System.out.println(element.toString()+"\n"); 
    }
    
}
