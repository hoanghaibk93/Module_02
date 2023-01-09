package ss04_oop_class_object.thuc_hanh.swap;

public  class Swap {
    public static void change(Student student) {
        Student newStudent = new Student(99, "no name");
        Student temp = student;
        student = newStudent;
        newStudent = temp;
        //temp.setName("hoanghai");
    }

    public static void main(String[] args) {
        Student student1 = new Student(1, "A");
        change(student1);
        System.out.println(student1.toString());

    }
}
