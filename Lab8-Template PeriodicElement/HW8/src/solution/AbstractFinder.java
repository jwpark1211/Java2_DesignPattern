package solution;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractFinder<T> {
    abstract String getUserInput(); //조건을 입력
    abstract Boolean predicate(T element); //조건 일치 여부 판단
    //Template method
    List<T> find(List<T> elements){
        List<T> find = new ArrayList<>();
        for(T e : elements){
            //객체가 조건에 맞으면
            if(predicate(e)){
                //List에 추가
                find.add(e);
            }
        }
        //List return 
        return find;
    };
}
