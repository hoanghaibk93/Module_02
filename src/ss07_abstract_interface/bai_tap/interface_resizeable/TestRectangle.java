package ss07_abstract_interface.bai_tap.interface_resizeable;

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);
        rectangle = new Rectangle(4,5);
        System.out.println(rectangle);
        rectangle =new Rectangle(2,3,"blue",false);
        System.out.println(rectangle);
        System.out.println("Before resizeable: ");
        System.out.println(rectangle);
        rectangle.resize(50);
        System.out.println("After resizeable: ");
        System.out.println(rectangle);
    }
}
