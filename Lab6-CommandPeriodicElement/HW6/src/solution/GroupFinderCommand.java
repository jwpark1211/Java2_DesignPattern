package solution;

import java.util.ArrayList;
import java.util.List;

import template.PeriodicElement;

public class GroupFinderCommand extends FinderCommand{
    private String group;
    private UserInput userInput = new UserInput();
    //command 실행 (캡슐화 구현)
    @Override
    public List<PeriodicElement> execute(List<PeriodicElement> list) {
        prevElements = list; //이전 상태 저장 
        List<PeriodicElement> foundElements = new ArrayList<>();

        if (group == null) {
            //group 값 입력
            System.out.print("Please enter [group] of PeriodicElement[1-18]:");
            group = userInput.getString();
        }   
        //String을 ',' 로 잘라 저장 
        String [] splitArray = group.split(",");
        for(PeriodicElement e : list){
            for(String group : splitArray){
                //splitArray를 돌며 값이 같은 원소 추출 
                if(e.getGroup() == Integer.parseInt(group)){
                    foundElements.add(e);
                }
            }
        }
        //추출한 원소들 리턴
        return foundElements;
    }
}
