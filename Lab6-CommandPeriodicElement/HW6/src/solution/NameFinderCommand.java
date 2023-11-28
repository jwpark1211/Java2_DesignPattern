package solution;

import java.util.ArrayList;
import java.util.List;

import template.PeriodicElement;

public class NameFinderCommand extends FinderCommand{
    private String name;
    private UserInput userInput = new UserInput();
    //command 실행 (캡슐화 구현)
    @Override
    public List<PeriodicElement> execute(List<PeriodicElement> list) {
        prevElements = list;
        List<PeriodicElement> foundElements = new ArrayList<>();

        if (name == null) {
            //name 값 입력 
            System.out.print("Please enter [name] of PeriodicElement:");
            name = userInput.getString();
        }   
        //String을 ',' 로 잘라 저장 
        String [] splitArray = name.split(",");

        for(PeriodicElement e : list){
            for(String name : splitArray){
                //splitArray를 돌며 값이 같은 원소 추출 
                if(e.getName().equals(name)){
                    foundElements.add(e);
                }
            }
        }
        //추출한 원소들 리턴
        return foundElements;
    }
    
}
