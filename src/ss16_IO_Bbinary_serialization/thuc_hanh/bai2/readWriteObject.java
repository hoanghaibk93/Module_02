package ss16_IO_Bbinary_serialization.thuc_hanh.bai2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class readWriteObject {
    public static void writeObject(String path, List<Student> students){
        try {
            FileOutputStream write = new FileOutputStream(path);
            ObjectOutputStream writeObj = new ObjectOutputStream(write);
            writeObj.writeObject(students);
            writeObj.close();
            write.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static List<Student> readObject(String path){
        List<Student> student = new ArrayList<>();
        try {
            FileInputStream read = new FileInputStream(path);
            ObjectInputStream readObj = new ObjectInputStream(read);
             student = (List<Student>) readObj.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return student;
    }

    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student(3,"Hai","Hue");
        Student student3 = new Student(2,"Hung","HN");
        Student student4 = new Student(5,"Nam","Dn");

        List<Student> list = new ArrayList<>();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        String path ="D:\\04_hoc_tap\\codegym\\c1122g1\\module_02\\src\\ss16_IO_Bbinary_serialization\\thuc_hanh\\bai2\\objectFile.dat";
        //readWriteObject.writeObject(path,list);
        System.out.println("Write already");
        List<Student> students=readWriteObject.readObject(path);
        for (Student student:students){
            System.out.println(student);
        }
    }
}
