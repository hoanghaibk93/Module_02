package ss09_dsa_list.thuc_hanh.nhap;

public class Node<E> {
    E data;
    Node<E> next;

    public Node(E data) {
        this.data = data;
    }

    public E getData() {
        return data;
    }

}
