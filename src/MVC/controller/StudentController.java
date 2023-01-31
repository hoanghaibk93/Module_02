package MVC.controller;

import MVC.model.Student;
import MVC.repository.StudentRepositoryImpL;
import MVC.service.StudentServiceImpl;

import java.util.Scanner;

public class StudentController {
    private static StudentServiceImpl service = new StudentServiceImpl();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int select = 0;
        do {
            System.out.println("-----Student Manager-----");
            System.out.println("1. List");
            System.out.println("2. Add new student");
            System.out.println("9. Exit");
            System.out.print("Please input number: ");
            select = Integer.parseInt(scanner.nextLine());
            switch (select) {
                case 1:
                    Student[] studentList = service.findAll();
                    for (Student student : studentList) {
                        System.out.println(student);
                    }
                    break;
                case 2:
                    System.out.println("input id");
                    int id = Integer.parseInt(scanner.nextLine());
                    System.out.println("input name");
                    String name = scanner.nextLine();
                    service.addStudent(new Student(name, id));
                    break;
                case 9:
                    System.exit(0);
                    break;
            }
        } while (true) ;
    }
}

