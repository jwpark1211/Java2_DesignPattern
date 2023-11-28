package solution;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class DynamicArray<E> implements DataCollection<E>{
    private Object[] data = null; //객체가 저장될 배열 
    private int length = 0; //길이
    private int capacity = 0; //수용 가능 길이 

    //생성자
    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.data = new Object[this.capacity];
    }

    //getter
    public Object[] getData() { return this.data;}
    public int getCapacity() { return this.capacity; }
    @Override
    public int length() { return this.length;}

    //배열 뒤에 객체 넣기 
    @Override
    public void put(E e) {
        if (this.length < this.capacity) {
            this.data[length++] = e; //객체 입력 후 length++
        }
        else {
            System.out.println("dynamic array increase size=" + length);
            this.length++;
            this.capacity++;
            copy(e, this.capacity);
        }
    }

    // 배열 길이 ++, 데이터 복사 
    private void copy(E e, int newCapacity) {
        Object[] newData = new Object[newCapacity];
        // copy before newSize - 1
        for (int i = 0; i < newCapacity - 1; i++) {
            newData[i] = this.data[i];
        }
        // copy p at the end
        newData[newCapacity - 1] = e;
        // update data with newData
        this.data = newData;
    }

    private void copy(int index, E e, int newCapacity) {
        Object[] newData = new Object[newCapacity];
        // copy before index
        for (int i = 0; i < index; i++) {
            newData[i] = this.data[i];
        }
        // copy p at the index
        newData[index] = e;
        // copy after index
        for (int i = newCapacity - 1; i > index; i--) {
            newData[i] = this.data[i-1];
        }
        // update data with newData
        this.data = newData;
    }

    @Override
    public void insert(int index, E e) {
        //새 객체가 배열에 들어갈 수 있으면(capacity로 비교)
        if (this.length + 1 < this.capacity) {
            this.length++;
            for (int i = this.length - 1; i > index - 1; i--) {
                //index 이후 객체들 한 칸씩 뒤로 이동
                this.data[i+1] = this.data[i]; 
            }
            // insert new e
            this.data[index] = e;
        } 
        else {
            System.out.println("insert: dynamic array increase capacity=" + capacity);
            this.length++;
            this.capacity++;
            copy(index, e, this.capacity);
        }
    }

    @Override
    public void remove(int index) {
        if (index < 0 || index > length) {
            System.out.println("Error ArrayIndexOutOfBounds");
        }
        else {
            //삭제 index 이후 객체들 앞으로 한 칸씩 이동
            for (int i = index; i < length-1; i++) {
                this.data[i] = this.data[i+1];
            }
            this.length--;
            this.data[length] = null; //마지막 칸 null
        }
    }

    @Override
    public E elemAt(int index) {
        // if index in the array bounds
        if (index >= 0 && index < this.length) {
            //해당 index의 객체 return 
            return (E)this.data[index];
        }
        return null;
    }

    @Override
    public void clear() {
        //data[] 재생성, length 0으로 초기화
        this.data = new Object[this.capacity];
        this.length = 0;
    }

    // inner class
    public class DynamicArrayIterator implements Iterator<E> {
        private int index = 0;
        //다음 값이 존재하는가
        @Override
        public boolean hasNext() {
            return index < length;
        }
        //다음 객체를 return
        @Override
        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return elemAt(index++);
        }
        //index-1 객체를 삭제 
        @Override
        public void remove() {
            DynamicArray.this.remove(--index);
        }
    }

    @Override //iterator return 
    public Iterator<E> iterator() {
        return new DynamicArrayIterator();
    }
}
