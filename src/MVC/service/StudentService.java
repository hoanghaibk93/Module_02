package MVC.service;

import MVC.model.Student;

public interface StudentService {
    Student[] findAll();
    void addStudent(Student student);
}
