package ss09_dsa_list.thuc_hanh.bai2;

public class Node {
     Node next;
    private Object data;

    public Node(Object data) {
        this.data = data;
    }

    public Object getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }
}
