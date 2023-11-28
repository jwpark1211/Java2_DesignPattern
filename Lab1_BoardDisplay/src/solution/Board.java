package solution;

import java.util.ArrayList;
import java.util.List;

public class Board {

    private int size;
    private List<Integer> spots = new ArrayList<>();

    //constructor - size
    public Board(int size){
        this.size = size;
        for(int i=1; i<=size*size; i++){
            this.spots.add(i);
        }
    }

    //constructor - spots(List<Integer>) 
    public Board(List<Integer> spots){
        this.size = (int)Math.sqrt((double)spots.size());
        this.spots = spots;
    }

    // return size
    public int size(){ return size; }

    // return spots.get(index)
    public int valueAt(int index){ return this.spots.get(index); }

    //return spots
    public List<Integer> spots() { return this.spots; }

    // valuesAt method는 사용하지 않아 구현하지 않았습니다.
    // List<Integer> valuesAt(List<Integer> indices)
    
}
