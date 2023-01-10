package ss07_abstract_interface.bai_tap.interface_resizeable;

import java.util.Scanner;

public class TestResizeable {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(3.5, "White", false);
        shapes[1] = new Rectangle(2.5, 4.5, "red", true);
        shapes[2] = new Square();
        double percent = (Math.random() * ((100 - 1) + 1)) + 1;
        System.out.println("Before resizeable:");
        for (int i = 0; i < shapes.length; i++) {
            System.out.println(shapes[i]);
        }
        System.out.println("After resizeable: " + percent + " %");
        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] instanceof Circle) {
                Circle shapes1 = (Circle) shapes[i];
                shapes1.resize(percent);
                System.out.println(shapes1.toString());
            } else if (shapes[i] instanceof Rectangle) {
                Rectangle shapes1 = (Rectangle) shapes[i];
                shapes1.resize(percent);
                System.out.println(shapes1.toString());
            } else {
                Square shapes1 = (Square) shapes[i];
                shapes1.resize(percent);
                System.out.println(shapes1.toString());
            }
        }
    }
}
