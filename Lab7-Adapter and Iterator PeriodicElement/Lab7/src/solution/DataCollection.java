package solution;

public interface DataCollection <E> extends Iterable<E>{
    void put(E e);// put element to the dynamic array
    void insert(int index, E e);// insert element at the index
    void remove(int index);// remove element at the index
    E elemAt(int index);// get element at the index
    int length(); // get the length of dynamic array (# of elements)
    void clear();// remove all elements and rese
}
