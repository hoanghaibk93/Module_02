package MVC.repository;

import MVC.model.Student;

public interface StudentRepository {
    Student[] findAll();
    void addStudent(Student student);
}
