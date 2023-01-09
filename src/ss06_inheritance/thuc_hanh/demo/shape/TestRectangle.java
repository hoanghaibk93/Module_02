package ss06_inheritance.thuc_hanh.demo.shape;

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);
        rectangle = new Rectangle(2, 3);
        System.out.println(rectangle);
        rectangle = new Rectangle("blue", false, 4, 3);
        System.out.println(rectangle);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());
    }
}
