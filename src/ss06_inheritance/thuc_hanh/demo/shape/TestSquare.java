package ss06_inheritance.thuc_hanh.demo.shape;

public class TestSquare {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);
        square = new Square(4.0);
        System.out.println(square);
        square = new Square("blue",false,5);
        System.out.println(square);
        //square.setSide(2);
        square.setWidth(1);
        square.setLength(5);
        System.out.println(square);
        System.out.println(square.getWidth());
        System.out.println(square.getPerimeter());
        System.out.println(square.getArea());
    }
}
