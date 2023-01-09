package ss05_access_modifier_static.thuc_hanh.bai1;

public class Student {
    private int rollno;
    public String name ="hai";
    private static String college = "BBDIT";

    public Student(String name) {
        this.name = name;
    }

    public Student() {
    }

    public int getRollno() {
        return rollno;
    }

    String getName() {
        return name;
    }

    public static String getCollege() {
        return college;
    }

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
