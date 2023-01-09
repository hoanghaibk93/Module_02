package ss06_inheritance.thuc_hanh.demo.shape;

public class ShapTest {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);
        shape = new Shape("red",false);
        System.out.println(shape);
    }
}
