package solution;

import java.util.List;

import template.PeriodicElement;

public class SymbolFinder implements IPeriodicElementFinder{

    @Override
    public void find(List<PeriodicElement> list) {
        System.out.println("*Symbol finder");
        System.out.println("Please enter [symbol] of PeriodicElement: ");
        
        //UserInput 객체를 통해 원소의 symbol을 random하게 저장
        String symbol = UserInput.getPeriodicElementSymbol(list);
        System.out.println("symbol: "+ symbol);

        PeriodicElement resultElement = null;
        //List 객체의 element.symbol 값과 Input 값이 동일한지 확인
        for(PeriodicElement element : list){
            if(element.getSymbol().equals(symbol)){
                resultElement = element;
            }
        }

        //{Exception} Input에 해당되는 element가 없는 경우
        if(resultElement == null) throw new IllegalArgumentException(
            "No element exists that matches the element symbol.");

        //검색한 element의 Information을 출력
        System.out.println("["+symbol+"] PeriodicElement Information: ");
        System.out.println(resultElement.toString()+"\n"); 
    }
    
}
