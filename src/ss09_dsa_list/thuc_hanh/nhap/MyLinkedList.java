package ss09_dsa_list.thuc_hanh.nhap;


public class MyLinkedList<E> {
    Node<E> head;
    Node<E> tail;
    int numNodes = 0;

    public MyLinkedList(E data) {
        head = new Node(data);
    }

    public MyLinkedList() {
    }

    public void add(int index, Object data) {
        Node current = head;
        Node temp;
        if (index < 0 || index > numNodes) {
            throw new IndexOutOfBoundsException();
        }
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }
        temp = current.next;
        current.next = new Node(data);
        current.next.next = temp;
        numNodes++;
    }

    public void addFirst(Object data) {
        Node temp;
        temp = new Node(data);
        temp.next = head;
        head = temp;
        numNodes++;
        if (tail == null)
            tail = head;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "\t");
            temp = temp.next;
        }
    }

    public E get(int index) {
        if (index < 0 || index >= numNodes) {
            throw new IndexOutOfBoundsException();
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return (E) temp.getData();
    }

    public void addLast(E data) {
        Node temp = head;
//        for (int i = 0; i < numNodes; i++) {
//            temp = temp.next;
//        }
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = new Node(data);
        temp.next.next = null;
        numNodes++;
    }

    public int size() {
        if (head == null) {
            return 0;
        }
        return numNodes;
    }

    public E remove(int index) {
        Node temp = head;
        Node holder;
        if (index == 0) {
            removeFirst();
        } else if (index == numNodes - 1) {
            removeLast();
        }
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        holder = temp.next.next;
        temp.next = holder;
        numNodes--;
        return get(index);

    }

    public void removeFirst() {
        Node temp = head;
        head = temp.next;
        numNodes--;
    }

    public void removeLast() {
        Node temp = head;
//        while (temp.next != null){
//            temp = temp.next;
//        }
        for (int i = 0; i < numNodes - 1; i++) {
            temp = temp.next;
        }
        temp.next = null;
        numNodes--;
    }

    public boolean contain(E data) {
        Node temp = head;
        int count = 0;
        for (int i = 0; i < numNodes; i++) {
            if ((temp.getData()).equals(data)) {
                count++;
            }
            temp = temp.next;
        }
        if (count > 0) {
            return true;
        } else {
            return false;
        }
    }

    public int indexOf(E data) {
        Node temp = head;
        int count = 0;
        if (numNodes <= 0) {
            return -1;
        } else {
            for (int i = 0; i < numNodes; i++) {
                if (temp.data.equals(data)) {
                    count++;
                    return i;
                }
                temp = temp.next;
            }
            return -1;
        }
    }

}