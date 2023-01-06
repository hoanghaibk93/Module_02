package ss05_access_modifier_static.bai_tap.student;

public class Student {
    private String name = "John";
    private String classes = "CO2";

    public Student() {
    }

    protected void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public String getName() {
        return name;
    }

    public String getClasses() {
        return classes;
    }
    public String display() {
        return "name: " + this.name + ", classes: " + this.classes;
    }
}
