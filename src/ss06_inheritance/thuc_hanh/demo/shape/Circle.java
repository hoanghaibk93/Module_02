package ss06_inheritance.thuc_hanh.demo.shape;

public class Circle extends Shape {
    double radius;

    public Circle() {
        radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    Double getArea() {
        Double area = Math.PI * Math.pow(radius, 2);
        return area;
    }

    Double getPerimeter() {
        Double perimeter = Math.PI * 2 * radius;
        return perimeter;
    }


    @Override
    public String toString() {
        return "A circle with radius= " + getRadius() + ", which is a subclass of " + super.toString();
    }
}
