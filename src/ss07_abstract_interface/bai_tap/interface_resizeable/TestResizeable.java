package ss07_abstract_interface.bai_tap.interface_resizeable;

import java.util.Scanner;

public class TestResizeable {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle();
        shapes[1] = new Rectangle();
        shapes[2] = new Square();
        System.out.println("Enter a percent that you get a raise scale of shape:");
        Scanner scanner = new Scanner(System.in);
        double percent = Double.parseDouble(scanner.nextLine());
        System.out.println("Before resizeable:");
        for (int i = 0; i < shapes.length; i++) {
            System.out.println(shapes[i]);
        }
        System.out.println("After resizeable:");
        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] instanceof Circle) {
                Circle shapes1 = (Circle) shapes[i];
                shapes1.resize(percent);
                System.out.println(shapes1.toString());
            } else if(shapes[i] instanceof Rectangle ){
                Rectangle shapes1 = (Rectangle)shapes[i];
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
