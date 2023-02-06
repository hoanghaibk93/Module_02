package demo;

import java.util.ArrayList;
import java.util.List;

public class EqualStudent2 {
    public static void main(String[] args) {
        Student student1 = new Student("123", "Cong", "cong@gmail.com", 22);
        Student student2 = new Student("123", "Cong", "cong@gmail.com", 22);
        Student student3 = new Student("456", "Dung", "dung@gmail.com", 18);

        // tạo danh sách student
        List<Student> listStudents = new ArrayList<>();

        // thêm các đối tượng student vào listStudents
        listStudents.add(student1);
        listStudents.add(student2);
        listStudents.add(student3);

        // tạo các đối tượng student chỉ có thuộc tính ID
        Student searchStudent1 = new Student("Cong");
        Student searchStudent4 = new Student("456", "Dung", "dung@gmail.com", 18);

        // tìm kiếm student trong danh sách
        System.out.println("Search student1: "
                + listStudents.contains(searchStudent1));
        System.out.println("Search student4: "
                + listStudents.contains(searchStudent4));
    }
}
