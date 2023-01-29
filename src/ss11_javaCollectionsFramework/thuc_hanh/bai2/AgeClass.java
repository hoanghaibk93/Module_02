package ss11_javaCollectionsFramework.thuc_hanh.bai2;

import java.util.Comparator;

public class AgeClass implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o2.getAge()-o1.getAge();
    }
}
