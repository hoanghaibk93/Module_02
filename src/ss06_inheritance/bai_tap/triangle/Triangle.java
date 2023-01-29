package ss06_inheritance.bai_tap.triangle;

public class Triangle extends Shape {
    double side1, side2, side3;

    public Triangle() {
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(String color, double side1, double side2, double side3) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getPerimeter() {
        double perimeter = side1 + side2 + side3;
        return perimeter;
    }

    public double getArea() {
        double area = Math.sqrt(getPerimeter() * (getPerimeter() - side1) * (getPerimeter() - side2) * (getPerimeter() - side3));
        return area;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                ", which is a subclass of " +
                super.toString() +
                ", area: " +
                getArea() +
                "and perimeter: " +
                getPerimeter() +
                '}';
    }
}
