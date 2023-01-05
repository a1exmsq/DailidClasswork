package by.academy.classwork.lesson13;

import java.util.Arrays;

public class CustomArrayList<T> {

    private static final int DEFAULT_CAPACITY = 16;
    private T[] array;
    private int index;

    @SuppressWarnings("unchecked")
    public CustomArrayList() {
        super();
        this.array = (T[])new Object[DEFAULT_CAPACITY];
    }

    @SuppressWarnings("unchecked")
    public CustomArrayList(int capacity) {
        super();
        this.array = (T[])new Object[capacity];
    }

    public void add(T obj) {
        if (array.length < index) {
            grow();
        }
        array[index++] = obj;
    }

    @SuppressWarnings("unchecked")
    private void grow() {
        T[] newArray = (T[])new Object[array.length * 2 + 1];
        System.arraycopy(array, 0, newArray, 0, array.length);
        array = newArray;
    }

    public void print(){
        @SuppressWarnings("unchecked")
        T[] temp = (T[])new Object[index];
        System.arraycopy(array, 0, temp, 0, index);
        System.out.println(Arrays.toString(array));
    }

    public T get(int i){
        return array[i];
    }

    public T getLast(){
        if (index == 0){
            return null;
        }
        return array[index - 1];
    }
    public T getFirst(){
        if (index == 0){
            return null;
        }
        return array[0];
    }

    public int size(){
        return index;
    }

    public int capacity(){
        return array.length;
    }

    public T remove(int i){
        T temp = array[i];
        System.arraycopy(array, i + 1, array, i , index - 1);
        array[array.length - 1] = null;
        index--;
        return temp;
    }

    public T remove(T obj) {
        for (int i = 0; i < index; i++){
            if (array[i].equals(obj)) {
                return remove(i);
            }
        }
        return null;
    }
}
