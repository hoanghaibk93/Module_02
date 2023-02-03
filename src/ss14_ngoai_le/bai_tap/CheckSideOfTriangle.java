package ss14_ngoai_le.bai_tap;

import java.util.Scanner;

public class CheckSideOfTriangle {
    public void triangle(int a, int b, int c) {
        try {
            if (a < b + c && b < a + c && c < a + b) {
                System.out.println(a + ", " + b + ", " + c + " are sides of triangle");
            } else {
                throw new IllegalTriangleException();
            }
        } catch (IllegalTriangleException e) {
            System.out.println(a + ", " + b + ", " + c + " are not sides of triangle or negative number");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int c = 0;
        do {
            System.out.println("Enter three sides of triangle ");
            try {
                System.out.println("Side a: ");
                a = Integer.parseInt(scanner.nextLine());
                System.out.println("Side b: ");
                b = Integer.parseInt(scanner.nextLine());
                System.out.println("Side c: ");
                c = Integer.parseInt(scanner.nextLine());
                CheckSideOfTriangle checkSideOfTriangle = new CheckSideOfTriangle();
                checkSideOfTriangle.triangle(a, b, c);
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        } while (!(a < b + c && b < a + c && c < a + b && a > 0 && b > 0 && c > 0));
    }
}
