package MVC.repository;

import MVC.model.Student;

public class StudentRepositoryImpL implements StudentRepository {
    private static Student[] studentList;
    private static int size = 0;
    static {
        studentList = new Student[10];
        studentList[0] = new Student("Hai",1);
        studentList[1] = new Student("Hoang",2);
        studentList[2] = new Student("Phuc",3);
        size = 3;
    }
    @Override
    public Student[] findAll() {
        Student[] students = new Student[size];
        for (int i = 0; i < size; i++) {
            students[i] = studentList[i];
        }
        return students;
    }

    @Override
    public void addStudent(Student student) {
        studentList[size] = student;
        size++;
    }
}
