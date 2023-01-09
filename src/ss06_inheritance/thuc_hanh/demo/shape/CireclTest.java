package ss06_inheritance.thuc_hanh.demo.shape;

public class CireclTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);
        circle = new Circle(2);
        System.out.println(circle);
        circle = new Circle("white", false,3);
        System.out.println(circle);
    }
}
