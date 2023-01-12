package ss09_dsa_list.bai_tap.linkedlist;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList("Hai");
        myLinkedList.addFirst("Hoang");
        myLinkedList.addFirst("Hanh");
        myLinkedList.add(2, "Huy");
        myLinkedList.add(0, "Tuan");
        myLinkedList.addFirst("Tung");
        myLinkedList.addFirst("Cong");
        myLinkedList.remote(2);
        myLinkedList.remoteLast();
        myLinkedList.remoteFirst();
        myLinkedList.printList();
    }
}
