package ss09_dsa_list.thuc_hanh.nhap;

import java.util.Arrays;

public class MyList<E> {
    int size = 0;
    public final int DEFAULT_CAPACITY = 10;
    E[] elements;

    public MyList() {
        elements = (E[]) new Object[DEFAULT_CAPACITY];
    }

    public void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void add(E e) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = e;
    }

    public E get(int i) {
        if (i < 0 || i >= size) {
            throw new IndexOutOfBoundsException("Index:" + i + ", Size "+i);
        }
        return elements[i];
    }

}
