package ss07_abstract_interface.bai_tap.interface_resizeable;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);
        circle = new Circle(2.5);
        circle.setFilled(false);
        System.out.println(circle);
        circle = new Circle(3,"yellow",true);
        System.out.println(circle);
        System.out.println("Before resizeable: ");
        System.out.println(circle);
        System.out.println("After resizeable:");
        circle.resize(50);
        System.out.println(circle);
    }
}
