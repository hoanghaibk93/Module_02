package ss07_abstract_interface.bai_tap.interface_resizeable;

public class TestSquare {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);
        square = new Square(4.5);
        System.out.println(square);
        square = new Square("red", false, 3);
        System.out.println(square);
        System.out.println("Before resizeable: ");
        System.out.println(square);
        square.resize(50);
        System.out.println("After resizeable: ");
        System.out.println(square);
    }
}
