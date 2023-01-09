package ss04_oop_class_object.thuc_hanh;

import java.util.Scanner;

public class Person {
    String name;
    int id;


    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }



//    public Person() {
//    }
    public Person() {
        setName();
    }

    public void setName() {
        System.out.println("Nhap ten");
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
    }
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String sayHello() {
        return "hello world";
    }

//    public static void main(String[] args) {
//        Person person = new Person();
//        System.out.println(person);
//        System.out.println(person.name);
//        System.out.println(person.id);
//        System.out.println(person.sayHello());
//        String abc = person.sayHello();
//        System.out.println(abc);
//    }
}
