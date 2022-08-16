package Lesson04.ClassWork;

import java.util.Arrays;

public class ListAr<T> {
    private Object[] array;
    private int nextIndex;

    public ListAr(int size) {
        array = new Object[size];
    }

    public Object[] getArray() {
        return array;
    }

    public ListAr() {
        this(10);
    }

    public void add(T element) {
        if (this.nextIndex < array.length) {
            array[nextIndex] = element;
            nextIndex++;
        } else {
            Object[] temp = new Object[array.length + 10];
            System.arraycopy(array, 0, temp, 0, array.length);
            array = temp.clone();
            array[nextIndex] = element;
            nextIndex++;
        }
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("[");
        for (int i = 0; i < nextIndex; i++) {
            str.append(" ");
            if (i + 1 == nextIndex) {
                str.append(array[i] + " ");
            } else {
                str.append(array[i] + ", ");
            }
        }
        str.append("]");
        return str.toString();
    }
}
