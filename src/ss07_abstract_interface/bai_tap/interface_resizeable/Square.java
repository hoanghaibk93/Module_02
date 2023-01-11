package ss07_abstract_interface.bai_tap.interface_resizeable;

public class Square extends Shape implements IResizeable {
    private double side = 1.0;

    public Square() {

    }

    public Square(double side) {
        this.side = side;
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }

    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                + ", area is "
                + getArea()
                + ", perimeter is "
                + getPerimeter()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public void resize(double percent) {
        side = side * (percent / 100 + 1);
    }
}
