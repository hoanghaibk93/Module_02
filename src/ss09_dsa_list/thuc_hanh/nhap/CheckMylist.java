package ss09_dsa_list.thuc_hanh.nhap;

public class CheckMylist {
    public static void main(String[] args) {

        MyList<Integer> integerMyList = new MyList<Integer>();
        integerMyList.add(2);
        integerMyList.add(3);
        integerMyList.add(4);
        integerMyList.add(5);
        System.out.println(integerMyList.size);
        System.out.println(integerMyList.get(-1));

    }
}
