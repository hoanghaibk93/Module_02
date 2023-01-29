package ss07_abstract_interface.bai_tap.interface_resizeable;

import java.util.Scanner;

public class TestResizeable {
    public static void main(String[] args) {
        //option1
//        Shape[] shapes = new Shape[3];
//        shapes[0] = new Circle(3.5, "White", false);
//        shapes[1] = new Rectangle(2.5, 4.5, "red", true);
//        shapes[2] = new Square();
//        double percent = (Math.random() * ((100 - 1) + 1)) + 1;
//        System.out.println("Before resizeable:");
//        for (int i = 0; i < shapes.length; i++) {
//            System.out.println(shapes[i]);
//        }
//        System.out.println("After resizeable: " + percent + " %");
//        for (int i = 0; i < shapes.length; i++) {
//            if (shapes[i] instanceof Circle) {
//                Circle shapes1 = (Circle) shapes[i];
//                shapes1.resize(percent);
//                System.out.println(shapes1.toString());
//            } else if (shapes[i] instanceof Rectangle) {
//                Rectangle shapes1 = (Rectangle) shapes[i];
//                shapes1.resize(percent);
//                System.out.println(shapes1.toString());
//            } else {
//                Square shapes1 = (Square) shapes[i];
//                shapes1.resize(percent);
//                System.out.println(shapes1.toString());
//            }
//        }
        //option 2
//        double percent = (Math.random() * ((100 - 1) + 1)) + 1;
//        IResizeable[] iResizeables = new IResizeable[3];
//        iResizeables[0] = new Circle(3.5, "while", false);
//        iResizeables[1] = new Rectangle(2.5, 4.5, "red", true);
//        iResizeables[2] = new Square();
//        for (int i = 0; i < iResizeables.length; i++) {
//            if (iResizeables[i] instanceof Circle) {
//                iResizeables[i].resize(percent);
//                System.out.println(iResizeables[i].toString());
//            } else if (iResizeables[i] instanceof Rectangle) {
//                iResizeables[i].resize(percent);
//                System.out.println(iResizeables[i].toString());
//            } else {
//                iResizeables[i].resize(percent);
//                System.out.println(iResizeables[i].toString());
//            }
//        }
        //option 3
        double percent = (Math.random() * ((100 - 1) + 1)) + 1;
        IResizeable[] iResizeables = new IResizeable[3];
        iResizeables[0] = new Circle();
        iResizeables[1] = new Rectangle();
        iResizeables[2] = new Square();
        for (int i = 0; i < iResizeables.length; i++) {
            if (iResizeables[i] instanceof Circle) {
                iResizeables[i] = new Circle(3.5, "while", false);

            } else if (iResizeables[i] instanceof Rectangle) {
                iResizeables[i] = new Rectangle(2.5, 4.5, "red", true);
            } else {
                iResizeables[i] = new Square();
            }
            iResizeables[i].resize(percent);
            System.out.println(iResizeables[i].toString());
        }
    }
}

