package ss05_access_modifier_static.bai_tap.student;

public class Test {
    public static void main(String[] args) {
        Student student1 = new Student();
        System.out.println(student1.display());
        student1.setName("hoang");
        student1.setClasses("CO3");
        System.out.println(student1.display());
    }
}
