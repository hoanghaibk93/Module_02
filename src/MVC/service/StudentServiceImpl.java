package MVC.service;

import MVC.model.Student;
import MVC.repository.StudentRepositoryImpL;

public class StudentServiceImpl implements StudentService {
    StudentRepositoryImpL repository = new StudentRepositoryImpL();

    @Override
    public Student[] findAll() {
        return repository.findAll();
    }

    @Override
    public void addStudent(Student student) {
     repository.addStudent(student);
    }
}
