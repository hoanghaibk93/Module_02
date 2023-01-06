package ss05_access_modifier_static.thuc_hanh.bai1;

public class Student {
    private int rollno;
    private  String name;
    private static String college = "BBDIT";

    Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }
    static void change(){
        college = "CODEGYM";
    }
    void display(){
        System.out.println(this.rollno +" " + this.name+ " "+ college);
    }
}
