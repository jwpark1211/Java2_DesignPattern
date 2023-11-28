package solution;

import java.util.Iterator;
import java.util.List;

public class ListDataCollectionAdapter<E> implements DataCollection<E> {
    private List list; //DataCollection으로 변환될 List

    //생성자
    public ListDataCollectionAdapter(List list){
        this.list = list;
    }

    @Override
    public Iterator iterator() {
        //DataCollection.iterator -> list.iterator
        return list.iterator();
    }

    @Override
    public void put(Object e) {
        //DataCollection.put -> list.add
        list.add(e);
    }

    @Override
    public void insert(int index, Object e) {
        //DataCollection.insert -> list.add
        list.add(index, e);
    }

    @Override
    public void remove(int index) {
        //DataCollection.remove -> list.remove
        list.remove(index);
    }

    @Override
    public E elemAt(int index) {
        //DataCollection.elemAt -> list.get
        return (E)list.get(index);
    }

    @Override
    public int length() {
        //DataCollection.length -> list.size
        return list.size();
    }

    @Override
    public void clear() {
        //DataCollection.clear -> list.removeAll
        list.removeAll(list);
    }
 
}
