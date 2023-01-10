package ss07_abstract_interface.Colorable;

public class TestColorable {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle(3.5, "White", false);
        shapes[1] = new Rectangle(2.5, 4.5, "red", true);
        shapes[2] = new Square();
        shapes[3] = new Square("blue", false, 5);

        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] instanceof Circle) {
                Circle shapes1 = (Circle) shapes[i];
                System.out.println(shapes1.toString());
            } else if (shapes[i] instanceof Square) {
                Square shapes1 = (Square) shapes[i];
                System.out.println(shapes1.toString());
                shapes1.howToColor();
            } else {
                Rectangle shapes1 = (Rectangle) shapes[i];
                System.out.println(shapes1.toString());
            }
        }
    }
}
