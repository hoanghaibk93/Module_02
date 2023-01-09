package ss04_oop_class_object.thuc_hanh.swap;

public class Student {
    String name;
    int id;

    public void setName(String name) {
        this.name = name;
    }

    public Student(int id, String name) {
        this.name = name;
        this.id = id;
    }
   public String toString(){
        return "id: " + this.id + "-name: " +this.name;
   }
}
