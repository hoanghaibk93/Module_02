package ss09_dsa_list.bai_tap.linkedlist;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList(25);
        myLinkedList.addFirst(myLinkedList);
        myLinkedList.addFirst(12);
        myLinkedList.addFirst(13);
        myLinkedList.add(4, 9);
        myLinkedList.add(4, 9);
        myLinkedList.remote(3);
        myLinkedList.remoteFirst();
        myLinkedList.remoteLast();
        System.out.println(myLinkedList);
        //myLinkedList.printList();
    }
}
