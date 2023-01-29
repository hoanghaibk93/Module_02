package ss09_dsa_list.thuc_hanh.nhap;

public class check {
    public static void main(String[] args) {
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();
        myLinkedList.addFirst(2);
        myLinkedList.addFirst(3);
        myLinkedList.addFirst(4);
        myLinkedList.addFirst(4);
        myLinkedList.add(1,10);
        //System.out.println(myLinkedList.get(1));
        myLinkedList.addLast(45);
        myLinkedList.addLast(46);
        myLinkedList.addLast(47);
        myLinkedList.addLast(50);

        System.out.println(myLinkedList.remove(1));
        System.out.println(myLinkedList.remove(2));

        // myLinkedList.remove(2);
//        myLinkedList.removeFirst();
//        myLinkedList.removeFirst();
//        myLinkedList.removeLast();
//        myLinkedList.removeLast();
        System.out.println(myLinkedList.size());
        //System.out.println(myLinkedList.contain(45));
        System.out.println(myLinkedList.indexOf(50));

        myLinkedList.printList();

    }
}
