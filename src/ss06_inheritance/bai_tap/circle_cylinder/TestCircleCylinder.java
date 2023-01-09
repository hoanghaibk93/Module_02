package ss06_inheritance.bai_tap.circle_cylinder;

public class TestCircleCylinder {
    public static void main(String[] args) {
        System.out.println("Example Circle:");
        Circle circle = new Circle();
        System.out.println(circle);
        circle.setColor("yellow");
        System.out.println(circle);
        circle = new Circle(6, "white");
        System.out.println(circle);
        System.out.println(circle.getArea());

        System.out.println("Example Cylinder:");
        Cylinder cylinder = new Cylinder();
        cylinder.setHeight(3);
        System.out.println(cylinder);
        cylinder = new Cylinder(5, "red", 4);
        cylinder.setColor("blue");
        System.out.println(cylinder);
        cylinder.setRadius(6);
        System.out.println(cylinder);
        System.out.println(cylinder.getVolume());

    }
}
