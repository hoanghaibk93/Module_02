package ss09_dsa_list.thuc_hanh.bai1;

import java.util.Arrays;

public class Mylist2<E> {
    private int size = 0;
    private final int DEFAULT_CAPACITY = 10;
    private Object element[];

    public Mylist2() {
        element = new Object[DEFAULT_CAPACITY];
    }

    public Mylist2(int size, E[] element) {
        this.size = size;
        this.element = element;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    //    public int getDEFAULT_CAPACITY() {
//        return DEFAULT_CAPACITY;
//    }
//
//    public E[] getElement() {
//        return element;
//    }
//
//    public void setElement(E[] element) {
//        this.element = element;
//    }
    private void ensureCapa() {
        int newSize = element.length * 2;
        element = Arrays.copyOf(element, newSize);
    }

    public void add(E e) {
        if (size == element.length) {
            ensureCapa();
        }
        element[size++] = e;
    }

    public E get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException();
        } else {
            return (E) element[i];
        }
    }
}
