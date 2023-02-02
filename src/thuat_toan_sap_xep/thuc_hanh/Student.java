package thuat_toan_sap_xep.thuc_hanh;

public class Student {
    int id;
    String name;

    //    Student() {
//        System.out.println("call Constructor mặc định");
//    }
    public Student(int id) {
        this.id = id;
    }

    Student(int id, String name) {
        this(id);
        //this(); // nó được sử dụng để gọi Constructor của lớp hiện tại
        this.id = id;
        this.name = name;
    }


    void display() {
        System.out.println(id + " " + name);
    }

    public  static void main(String args[]) {
        Student e1 = new Student(111, "Viet");
        Student e2 = new Student(222, "Nam");
        e1.display();
        e2.display();
    }
}
