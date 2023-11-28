package solution;

import java.util.List;

import template.PeriodicElement;

public class NameFinder implements IPeriodicElementFinder{

    @Override
    public void find(List<PeriodicElement> list) {
        System.out.println("*Name finder");
        System.out.println("Please enter [name] of PeriodicElement: ");
        
        //UserInput 객체를 통해 원소의 name을 random하게 저장
        String name = UserInput.getPeriodicElementName(list);
        System.out.println("name: "+ name);

        PeriodicElement resultElement = null;
        //List 객체의 element.name 값과 Input 값이 동일한지 확인
        for(PeriodicElement element : list){
            if(element.getName().equals(name)){
                resultElement = element;
            }
        }

        //{Exception} Input에 해당되는 element가 없는 경우
        if(resultElement == null) throw new IllegalArgumentException(
            "No element exists that matches the element name.");

        //검색한 element의 Information을 출력
        System.out.println("["+name+"] PeriodicElement Information: ");
        System.out.println(resultElement.toString()+"\n"); 
    }
    
}
