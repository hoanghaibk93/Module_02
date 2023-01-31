package ss11_javaCollectionsFramework.thuc_hanh.bai2;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Bam", 20, "HN");
        Student student2 = new Student("Cong", 23, "HN");
        Student student3 = new Student("An", 22, "HN");
        Student student4 = new Student("Dung", 26, "HN");
        Student student5 = new Student("Dung", 19, "HN");


        Map<Integer, Student> hashMap = new HashMap();
        hashMap.put(1,student1);
        hashMap.put(3,student2);
        hashMap.put(2,student3);
        hashMap.put(4,student1);
        for(Map.Entry<Integer,Student> studentEntry : hashMap.entrySet()){
            System.out.println(studentEntry.toString());
        }
        System.out.println("-----------Set");
        Set<Student> students = new HashSet<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        //students.add(student1);
        for(Student student: students){
            System.out.println(student.toString());
        }

        System.out.println("----------------List");
        System.out.println("Before sort");
        List<Student> list = new ArrayList<>();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        list.add(student5);
        for (Student student: list){
            System.out.println(student);
        }
        System.out.println("After sort");
        Collections.sort(list);

        //Collections.sort(list,new AgeClass());
        //Collections.reverse(list);

        for (Student student: list){
            System.out.println(student);
        }


    }
}