package solution;

import java.util.ArrayList;
import java.util.List;

import template.PeriodicElement;

public class PeriodFinder implements IPeriodicElementFinder{

    @Override
    public void find(List<PeriodicElement> list) {
        System.out.println("*Period finder");
        System.out.println("Please enter [period] of PeriodicElement: ");
        
        //UserInput 객체를 통해 1~7 사이 값을 random하게 저장
        int period = UserInput.getIntegerBetween(1, 7);
        System.out.println("period: "+ period);

        //한 period에 해당되는 element가 다수일 수 있으므로, List 형태로 값을 검색
        List<PeriodicElement> periodElement = new ArrayList<>();
        for(PeriodicElement element : list){
            //period가 input 값을 넘어갈 경우 반복문을 벗어남
            if(element.getPeriod() == period +1) break;
            
            //period가 input 값과 동일한지 확인
            if(element.getPeriod()==period){
                periodElement.add(element);
            }
        }

        System.out.println("["+period+"] PeriodicElement Information: ");
        for(PeriodicElement element : periodElement){
            //결과 List에 있는 element의 Information을 순차적으로 출력
            System.out.println(element.toString());
        }
        System.out.println();
    }
    
}
