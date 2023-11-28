package solution;

import java.util.ArrayList;
import java.util.List;

import template.PeriodicElement;

public class GroupFinder implements IPeriodicElementFinder {

    @Override
    public void find(List<PeriodicElement> list) {
        System.out.println("*Group finder");
        System.out.println("Please enter [group] of PeriodicElement: ");
        
        //UserInput 객체를 통해 1~18 사이 값을 random하게 저장
        int group = UserInput.getIntegerBetween(1, 18);
        System.out.println("group: "+ group);

        //한 group에 해당되는 element가 다수일 수 있으므로, List 형태로 값을 검색
        List<PeriodicElement> groupElement = new ArrayList<>();
        for(PeriodicElement element : list){
            //List 객체의 element.group 값과 Input 값이 동일한지 확인
            if(element.getGroup()==group){
                groupElement.add(element);
            }
        }

        System.out.println("["+group+"] PeriodicElement Information: ");
        for(PeriodicElement element : groupElement){
            //결과 List에 있는 element의 Information을 순차적으로 출력
            System.out.println(element.toString());
        }
        System.out.println();
    }
}
