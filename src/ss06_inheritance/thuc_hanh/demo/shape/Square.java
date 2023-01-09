package ss06_inheritance.thuc_hanh.demo.shape;

public class Square extends Rectangle {
    public Square() {

    }

    public Square(double side) {
        super(side, side);
    }


    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    public double getSide() {
        return super.getLength();
    }

    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }


    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setLength(double length) {
        setSide(length);
    }


    @Override
    public String toString() {
        return "A quare with side=" + getWidth() + ", which is a subclass of " + super.toString();
    }
}
