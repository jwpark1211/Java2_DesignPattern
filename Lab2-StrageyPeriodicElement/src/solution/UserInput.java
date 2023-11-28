package solution;

import java.util.List;
import java.util.Random;

import template.PeriodicElement;

/* UserInput : User의 Input 값을 Random하게 반환하는 Method Group */
public class UserInput {
    
    //[NumberFinder, GroupFinder, PeriodFinder 사용] 
    //min 과 max 사이에 있는 Random int를 반환
    public static int getIntegerBetween(int min, int max){
        if(min >= max) {
            //{Exception} min은 max보다 클 수 없다.
            throw new IllegalArgumentException(
                "max value cannot be less than min value.");
        }
        // util.Random을 통해 min과 max 사이 값 반환
        return new Random().nextInt((max-min)-1)+min;
    }

    //[NameFinder 사용] 
    //원소의 Name을 랜덤값으로 받아오기 
    public static String getPeriodicElementName(List<PeriodicElement> list){
        //getIntegerBetween()을 통해 1~118 사이 임의의 값을 받은 후, 해당되는 name을 저장
        String name =  list.get(getIntegerBetween(1, 118)).getName();

        if(name.isEmpty()){
            //{Exception} name이 null인 경우 
            throw new IllegalArgumentException(
                "No element name exists that matches the element number.");
        }

        return name;
    }

    //[SymbolFinder] 
    //원소의 Symbol을 랜덤값으로 받아오기
    public static String getPeriodicElementSymbol(List<PeriodicElement> list){
        //getIntegerBetween()을 통해 1~118 사이 임의의 값을 받은 후, 해당되는 symbol을 저장
        String symbol =  list.get(getIntegerBetween(1, 118)).getSymbol();

        if(symbol.isEmpty()){
            //{Exception} symbol이 null인 경우 
            throw new IllegalArgumentException(
                "No element symbol exists that matches the element number.");
        }

        return symbol;
    }

}
