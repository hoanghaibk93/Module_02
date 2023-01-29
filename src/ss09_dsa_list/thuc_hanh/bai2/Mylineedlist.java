package ss09_dsa_list.thuc_hanh.bai2;

public class Mylineedlist {
    private Node head;
    private int numNodes;

    public Mylineedlist(Object data) {
        head = new Node(data);
    }

    public void add(int index, Object data) {
        Node temp = head;
        Node holder;
        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(data);
        temp.next.next = holder;
        numNodes++;

    }

}

