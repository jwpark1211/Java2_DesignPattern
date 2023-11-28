package solution;

import java.util.ArrayList;
import java.util.List;

import template.PeriodicElement;

public class WeightFinderCommand extends FinderCommand{
    private String weight;
    private UserInput userInput = new UserInput();
    //command 실행 (캡슐화 구현)
    @Override
    public List<PeriodicElement> execute(List<PeriodicElement> list) {
        prevElements = list;//이전 상태 저장 
        List<PeriodicElement> foundElements = new ArrayList<>();

        if (weight == null) {
            //weight 값 입력
            System.out.print("Please enter [weight range] of PeriodicElement(ex. 50.0~100.0):");
            weight = userInput.getString();
        }   
        //String을 ',' 로 잘라 저장 
        String [] splitArray = weight.split("~");

        double min = Double.parseDouble(splitArray[0]);
        double max = Double.parseDouble(splitArray[1]);

        for(PeriodicElement e : list){
            for(String number : splitArray){
                //splitArray를 돌며 값이 같은 원소 추출 
                if(e.getMass()>=min && e.getMass()<=max){
                    foundElements.add(e);
                }
            }
        }
        //추출한 원소들 리턴
        return foundElements;
    }
    
}
