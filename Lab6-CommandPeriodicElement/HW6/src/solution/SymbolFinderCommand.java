package solution;

import java.util.ArrayList;
import java.util.List;

import template.PeriodicElement;

public class SymbolFinderCommand extends FinderCommand{
    private String symbol;
    private UserInput userInput = new UserInput();
    //command 실행 (캡슐화 구현)
    @Override
    public List<PeriodicElement> execute(List<PeriodicElement> list) {
        prevElements = list;//이전 상태 저장 
        List<PeriodicElement> foundElements = new ArrayList<>();

        if (symbol == null) {
            //symbol 값 입력
            System.out.print("Please enter [symbol] of PeriodicElement:");
            symbol = userInput.getString();
        }   
        //String을 ',' 로 잘라 저장 
        String [] splitArray = symbol.split(",");

        for(PeriodicElement e : list){
            for(String symbol : splitArray){
                //splitArray를 돌며 값이 같은 원소 추출 
                if(e.getSymbol().equals(symbol)){
                    foundElements.add(e);
                }
            }
        }
        //추출한 원소들 리턴
        return foundElements;
    }
    
}
