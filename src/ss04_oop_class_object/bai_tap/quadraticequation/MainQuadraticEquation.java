package ss04_oop_class_object.bai_tap.quadraticequation;

import java.util.Scanner;

public class MainQuadraticEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quadratic Equation: ax2 + bx + c = 0");
        System.out.println("Enter a");
        double a = Double.parseDouble(sc.nextLine());
        System.out.println("Enter b");
        double b = Double.parseDouble(sc.nextLine());
        System.out.println("Enter c");
        double c = Double.parseDouble(sc.nextLine());
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        if (quadraticEquation.getDiscriminant() > 0) {
            System.out.println("Equation has two roots x1= " + quadraticEquation.getRoot1() + ", x2=" + quadraticEquation.getRoot2());
        } else if (quadraticEquation.getDiscriminant() == 0){
            System.out.println("Equation has one double root x=" + quadraticEquation.getRoot1());
        } else {
            System.out.println("The equation has no roots");
        }
    }
}
