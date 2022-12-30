package ss01_introduction_to_java.bai_tap;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ReadNumberToCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.println("Enter a number");
        number = sc.nextInt();
        if (number < 10 && number >= 0) {
            switch (number) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                case 10:
                    System.out.println("Ten");
                    break;
                default:
                    System.out.println("out of ability");
                    break;
            }
        } else if (number <= 20) {
            int ones =  number % 10;
            switch (ones) {
                case 1:
                    System.out.println("Eleven");
                    break;
                case 2:
                    System.out.println("Twelve");
                    break;
                case 3:
                    System.out.println("Thirteen");
                    break;
                case 4:
                    System.out.println("Fourteen");
                    break;
                case 5:
                    System.out.println("Fifteen");
                    break;
                case 6:
                    System.out.println("Sixteen");
                    break;
                case 7:
                    System.out.println("Seventeen");
                    break;
                case 8:
                    System.out.println("Eighteen");
                    break;
                case 9:
                    System.out.println("Nineteen");
                    break;
                case 0:
                    System.out.println("Twenty");
                    break;
                default:
                    System.out.println("out of ability");
                    break;

            }
        }
    }
}

