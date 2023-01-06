package ss05_access_modifier_static.bai_tap.circle;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(3);
        System.out.println("circle1: radius= " + circle1.getRadius());
        System.out.println("circle1: Area= " + circle1.getArea());

        System.out.println("circle2: radius= " + circle2.getRadius());
        System.out.println("circle2: Area= " + circle2.getArea());
    }
}
