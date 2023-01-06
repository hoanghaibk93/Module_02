package ss05_access_modifier_static.bai_tap.circle;

public class Circle {
    private double radius = 1;
    private String color = "red";

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        double area = Math.PI * Math.pow(this.radius, 2);
        return area;
    }

}
