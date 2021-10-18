package ru.mirea.task13;
import java.util.Arrays;
import java.util.Iterator;

public class MyList<T> implements Iterable<T> {
    private final int INIT_SIZE = 1;
    private final int CUT_RATE = 4;
    private Object[] array = new Object[INIT_SIZE];
    private int pointer = 0;

    public void add(T item) {
        if(pointer == array.length-1) {
            resize(array.length + 1);
        }
        array[pointer++] = item;
    }

    public T get(int index) { return (T) array[index]; }

    public void remove(int index) {
        if (pointer - index >= 0) {
            System.arraycopy(array, index + 1, array, index, pointer - index);
        }
        array[pointer] = null;
        pointer--;
        if (array.length > INIT_SIZE && pointer < array.length / CUT_RATE) {
            resize(array.length / 2);
        }
    }

    public int size() { return pointer; }

    private void resize(int newLength) {
        Object[] newArray = new Object[newLength];
        System.arraycopy(array, 0, newArray, 0, pointer);
        array = newArray;
    }

    public Iterator<T> iterator() { return (Iterator<T>) Arrays.stream(removeNullElements(array)).iterator(); }

    private <T> T[] removeNullElements(T[] array) {
        array = Arrays.copyOf(array, array.length);
        int i = 0;
        for(int j = 0; j < array.length; j++) {
            if(array[j] != null) {
                array[i++] = array[j];
            }
        }
        return Arrays.copyOfRange(array, 0, i);
    }
}