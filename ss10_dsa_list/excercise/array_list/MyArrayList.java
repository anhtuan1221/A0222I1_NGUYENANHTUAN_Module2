package ss10_dsa_list.excercise.array_list;


import java.util.Arrays;

public class MyArrayList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object element[];

    public MyArrayList() {
        element = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayList(int capacity) {
        element = new Object[capacity];
    }

    private void ensureCapa() {
        int newSize = element.length * 2;
        element = Arrays.copyOf(element, newSize);
    }

    public void add(int index, E e) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ",Size " + index);
        } else if (index == size) {
            ensureCapa();
            element[index] = e;
            size++;
        } else {
            for (int i = size - 1; i >= index; i--) {
                element[i + 1] = element[i];
                size++;
                element[index] = e;
            }
        }
    }

    public Object remove(int index) {
        Object e;
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ",Size " + index);
        } else {
            e = element[index];
            for (int i = index + 1; i < size; i++) {
                element[i - 1] = element[i];
            }
            size--;
        }
        return e;
    }

    public int size() {
        return size;
    }

    public Object[] clone() {
        Object[] clone = new Object[size];
        for (int i = 0; i < size; i++) {
            clone[i] = element[i];
        }
        return clone;
    }

    public boolean contains(E e) {
        for (int i = 0; i < size; i++) {
            if (element.equals(e)) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(E o) {
        for (int i = 0; i < size; i++) {
            if (o == element[i]) {
                return i;
            }
        }
        return -1;
    }

    public boolean add(E e) {
        ensureCapa();
        size++;
        element[size - 1] = e;
        return true;
    }

    public Object get(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index);
        }
        return element[index];
    }

    public void clear() {
        element = new Object[0];
        size = 0;
    }
}
