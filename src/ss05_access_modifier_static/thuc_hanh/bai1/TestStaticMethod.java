package ss05_access_modifier_static.thuc_hanh.bai1;

public class TestStaticMethod {
    public static void main(String[] args) {
        Student.change();
        Student s0= new Student();
        Student s1 = new Student(111, "Hoang");
        Student s2 = new Student(222, "Khanh");
        Student s3 = new Student(333, "Nam");
        s1.display();
        s2.display();
        s3.display();
        System.out.println(s1.name);
        System.out.println(s1.getName());
        System.out.println(s0.getName());
        System.out.println(s0.getRollno());
//        s1.getName();
//        s1.change();
//        s1.display();
    }
}
