package ss04_oop_class_object.thuc_hanh;

public class Student {
    static int rollno = 1;
    static String name = "hue";
    static String college = "BachKhoa";

    static void change() {
        college = "QuocGia";
    }

    Student(int r, String n) {
        rollno = r;
        name = n;
    }

    static void display() {
        System.out.println(rollno + " " + name + " " + college);
    }
    static {
        System.out.println("con ga");
        System.exit(0);
    }

    public static void  main(String args[]) {
        System.out.println(Student.college);
        Student.change();
        Student.display();
        Student s1 = new Student(111, "Hoang");
        Student s2 = new Student(222, "Thanh");
        Student s3 = new Student(333, "Nam");
        s1.display();
        s2.display();
        s3.display();
    }

}
