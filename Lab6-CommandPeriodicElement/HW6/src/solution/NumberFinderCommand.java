package solution;

import java.util.ArrayList;
import java.util.List;

import template.PeriodicElement;

public class NumberFinderCommand extends FinderCommand{
    private String number;
    private UserInput userInput = new UserInput();
    //command 실행 (캡슐화 구현)
    @Override
    public List<PeriodicElement> execute(List<PeriodicElement> list) {
        prevElements = list;//이전 상태 저장 
        List<PeriodicElement> foundElements = new ArrayList<>();

        if (number == null) {
            //number 값 입력
            System.out.print("Please enter [number] of PeriodicElement[1-118]:");
            number = userInput.getString();
        }   
        //String을 ',' 로 잘라 저장 
        String [] splitArray = number.split(",");

        for(PeriodicElement e : list){
            for(String number : splitArray){
                //splitArray를 돌며 값이 같은 원소 추출 
                if(e.getNumber() == Integer.parseInt(number)){
                    foundElements.add(e);
                }
            }
        }
        //추출한 원소들 리턴
        return foundElements;
    }
    
}
