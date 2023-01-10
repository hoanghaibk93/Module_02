package ss07_abstract_interface.Colorable;

import ss07_abstract_interface.bai_tap.interface_resizeable.Circle;
import ss07_abstract_interface.bai_tap.interface_resizeable.Rectangle;
import ss07_abstract_interface.bai_tap.interface_resizeable.Shape;
import ss07_abstract_interface.bai_tap.interface_resizeable.Square;

public class TestColorable {
    public static void main(String[] args) {
        ss07_abstract_interface.bai_tap.interface_resizeable.Shape[] shapes = new Shape[3];
        shapes[0] = new ss07_abstract_interface.bai_tap.interface_resizeable.Circle(3.5, "White", false);
        shapes[1] = new ss07_abstract_interface.bai_tap.interface_resizeable.Rectangle(2.5, 4.5, "red", true);
        shapes[2] = new ss07_abstract_interface.bai_tap.interface_resizeable.Square();
        double percent = (Math.random() * ((100 - 1) + 1)) + 1;
        System.out.println("Before resizeable:");
        for (int i = 0; i < shapes.length; i++) {
            System.out.println(shapes[i]);
        }
        System.out.println("After resizeable: " + percent + " %");
        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] instanceof ss07_abstract_interface.bai_tap.interface_resizeable.Circle) {
                ss07_abstract_interface.bai_tap.interface_resizeable.Circle shapes1 = (Circle) shapes[i];
                shapes1.resize(percent);
                System.out.println(shapes1.toString());
            } else if (shapes[i] instanceof ss07_abstract_interface.bai_tap.interface_resizeable.Rectangle) {
                ss07_abstract_interface.bai_tap.interface_resizeable.Rectangle shapes1 = (Rectangle) shapes[i];
                shapes1.resize(percent);
                System.out.println(shapes1.toString());
            } else {
                ss07_abstract_interface.bai_tap.interface_resizeable.Square shapes1 = (Square) shapes[i];
                shapes1.resize(percent);
                System.out.println(shapes1.toString());
            }
        }
    }
}
