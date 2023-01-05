package ss04_oop_class_object.bai_tap.fan;


public class MainFan {
    public static void main(String[] args) {
        Fan fan1 = new Fan(3, true, 10, "yellow");
        Fan fan2 = new Fan(2, false, 5, "blue");
        System.out.println(fan1.toString1());
        System.out.println(fan2.toString1());
    }
}
