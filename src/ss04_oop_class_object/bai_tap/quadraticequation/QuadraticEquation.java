package ss04_oop_class_object.bai_tap.quadraticequation;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        return (Math.pow(this.b, 2) - 4 * this.a * this.c);
    }

    public double getRoot1() {
        return ((-this.b + Math.sqrt((Math.pow(this.b, 2) - 4 * this.a * this.c))) / (2 * this.a));
    }

    public double getRoot2() {
        return ((-this.b - Math.sqrt((Math.pow(this.b, 2) - 4 * this.a * this.c))) / (2 * this.a));
    }
}
