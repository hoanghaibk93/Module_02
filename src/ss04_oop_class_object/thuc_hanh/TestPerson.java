package ss04_oop_class_object.thuc_hanh;

public class TestPerson {
    public static void main(String[] args) {
        Person person = new Person();
        Person person1 = new Person();
       // Person person = new Person("ga", 1); //Lổi
        System.out.println(person);
        System.out.println(person.name);
        System.out.println(person.id);
        System.out.println(new Person("hai",3).name);
        System.out.println(new Person("hoang",4).id);
        System.out.println(person1.id);
    }
}
