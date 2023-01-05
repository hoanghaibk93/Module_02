package ss04_oop_class_object.bai_tap.fan;


public class MainFan {
    public static void main(String[] args) {
//        Option 1: contructor có tham số
//        Fan fan1 = new Fan(3, true, 10, "yellow");
//        Fan fan2 = new Fan(2, false, 5, "blue");
//        Option 2: contructor không có tham số
        Fan fan0 = new Fan(); // trạng thái fan0 lúc đầu
        Fan fan1 = new Fan();
        fan1.setSpeed(3);
        fan1.setOn(true);
        fan1.setRadius(10);
        fan1.setColor("yellow");

        Fan fan2 = new Fan();
        fan2.setSpeed(2);
        fan2.setOn(false);
        fan2.setRadius(5);
        fan2.setColor("blue");

        System.out.println("fan0: " + fan0.toString());
        System.out.println("fan1: " + fan1.toString());
        System.out.println("fan2: " + fan2.toString());
    }
}
