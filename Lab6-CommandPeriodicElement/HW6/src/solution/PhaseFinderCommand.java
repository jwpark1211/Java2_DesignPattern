package solution;

import java.util.ArrayList;
import java.util.List;

import template.PeriodicElement;
import template.Phase;

public class PhaseFinderCommand extends FinderCommand{
    private Phase phase;
    private UserInput userInput = new UserInput();
    //command 실행 (캡슐화 구현)
    @Override
    public List<PeriodicElement> execute(List<PeriodicElement> list){
        prevElements = list;//이전 상태 저장 
        List<PeriodicElement> foundElements = new ArrayList<>();

        if (phase == null) {
            //phase 값 입력 -> Enum으로 변환
            System.out.print("Please enter [phase] of PeriodicElement[e.g. gas, liq, solid, artificial]:");
            phase = Phase.valueOf(userInput.getString());
    }

        for(PeriodicElement e : list){
            //splitArray를 돌며 값이 같은 원소 추출
            if(e.getPhase() == phase){
                foundElements.add(e);
            }
        }
        //추출한 원소들 리턴
        return foundElements;
    }

}
