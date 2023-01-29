package ss09_dsa_list.thuc_hanh.bai1;

public class mylisttest  {
    public static void main(String[] args) {
        Mylist2<Integer> mylist2 = new Mylist2<>();
        mylist2.add(2);
        mylist2.add(3);
        mylist2.add(4);
        mylist2.add(5);
        mylist2.add(6);
        mylist2.add(2);
        mylist2.add(3);
        mylist2.add(4);
        mylist2.add(5);
        mylist2.add(6);
        mylist2.add(6);
        System.out.println(mylist2.get(1));
        System.out.println(mylist2.get(-1));



    }
}
