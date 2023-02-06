package ss04_oop_class_object.thuc_hanh;

public class Student extends Object  {
    private int rollno = 1;
    private String name = "hue";
    private String college = "BachKhoa";

//    //static void change() {
//        college = "QuocGia";
//    }

    Student(int r, String n) {
        rollno = r;
        name = n;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }


    public boolean equals(Student obj) {
        if (this.getRollno() == obj.rollno && this.getName().equals(obj.getName())) {
            return true;
        } else {
            return false;
        }
        //    static {
//        System.out.println("con ga");
//        System.exit(0);
//    }

    }

    public static void main(String args[]) {
//            System.out.println(Student.college);
//            Student.change();
//            Student.display();
        Student s1 = new Student(115, "Hoang");
        Student s2 = new Student(115, "Hoang");

        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);

    }

}
