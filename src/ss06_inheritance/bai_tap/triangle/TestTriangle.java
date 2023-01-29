package ss06_inheritance.bai_tap.triangle;

import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        double side1, side2, side3;
//        String color;
//        do {
//            System.out.println("Enter side1  of triangle");
//            side1 = Double.parseDouble(scanner.nextLine());
//            System.out.println("Enter side2  of triangle");
//            side2 = Double.parseDouble(scanner.nextLine());
//            System.out.println("Enter side3  of triangle");
//            side3 = Double.parseDouble(scanner.nextLine());
//            System.out.println("Enter a color of triangle");
//            color = scanner.nextLine();
//            if ((side1 >= (side2 + side3)) || (side2 >= (side1 + side3)) || (side3 >= (side1 + side2))) {
//                System.out.println("You enter again");
//            }
//        } while ((side1 >= (side2 + side3)) || (side2 >= (side1 + side3)) || (side3 >= (side1 + side2)));
//        Triangle triangle = new Triangle(color, side1, side2, side3);
//        System.out.println(triangle.toString());
        Shape shape = new Triangle();
        Triangle triangle1 = new Triangle();
        System.out.println(shape.getClass());
        System.out.println(triangle1.getClass().equals(shape.getClass()));
        System.out.println(triangle1.getClass() == (shape.getClass()));
//        Shape.go();
//        //shape.get;
//        triangle1.go();
//        Shape.go();
//        System.out.println(triangle1.getSide1());
//        System.out.println(((Triangle) shape).getSide1());
    }
}
