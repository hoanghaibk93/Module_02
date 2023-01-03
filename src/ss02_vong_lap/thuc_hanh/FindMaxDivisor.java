package ss02_vong_lap.thuc_hanh;

import java.util.Scanner;

public class FindMaxDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOne, numberTwo, numberThree;
        System.out.println("Enter the first number");
        numberOne = sc.nextInt();
        System.out.println("Enter the second number");
        numberTwo = sc.nextInt();

        numberThree = (numberOne <= numberTwo) ? numberOne : numberTwo;
        for (int i = numberThree; i <= numberOne && i <= numberTwo; i--) {
            if (numberOne % i == 0 && numberTwo % i == 0) {
                System.out.println("Uoc chung lon nhat la " + i);
                break;
            }
        }
    }
}
