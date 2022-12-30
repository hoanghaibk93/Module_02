package ss01_introduction_to_java.bai_tap;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ReadNumberToCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        String wordOne, wordTwo , wordThree;


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
        } else if (number < 20) {
            int ones = number % 10;
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
                default:
                    System.out.println("out of ability");

            }
        } else if (number <= 99) {
            int ones = number % 10;
            int tens = number / 10;


            switch (ones) {
                case 1:
                    wordOne = "one";
                    break;
                case 2:
                    wordOne = "two";
                    break;
                case 3:
                    wordOne = "three";
                    break;
                case 4:
                    wordOne = "four";
                    break;
                case 5:
                    wordOne = "five";
                    break;
                case 6:
                    wordOne = "six";
                    break;
                case 7:
                    wordOne = "seven";
                    break;
                case 8:
                    wordOne = "eight";
                    break;
                case 9:
                    wordOne = "nine";
                    break;
                default:
                    wordOne = "";
                    System.out.println("out of ability");
            }

            switch (tens) {
                case 2:
                    wordTwo = "Twenty";
                    break;
                case 3:
                    wordTwo = "Thirty";
                    break;
                case 4:
                    wordTwo = "Forty";
                    break;
                case 5:
                    wordTwo = "Fifty";
                    break;
                case 6:
                    wordTwo = "Sixty";
                    break;
                case 7:
                    wordTwo = "Seventy";
                    break;
                case 8:
                    wordTwo = "Eighty";
                    break;
                case 9:
                    wordTwo = "Ninety";
                    break;
                default:
                    wordTwo = "";
                    System.out.println("out of ability");
            }
            System.out.printf(wordTwo + " " + wordOne);
        } else if (number > 99 && number < 1000) {
            int ones = (number % 100) % 10;
            int tens = (number % 100) / 10;
            int twos = number / 100;

            switch (ones) {
                case 1:
                    wordOne = "one";
                    break;
                case 2:
                    wordOne = "two";
                    break;
                case 3:
                    wordOne = "three";
                    break;
                case 4:
                    wordOne = "four";
                    break;
                case 5:
                    wordOne = "five";
                    break;
                case 6:
                    wordOne = "six";
                    break;
                case 7:
                    wordOne = "seven";
                    break;
                case 8:
                    wordOne = "eight";
                    break;
                case 9:
                    wordOne = "nine";
                    break;
                default:
                    wordOne = "";
                    System.out.println("out of ability");
            }

            switch (tens) {
                case 2:
                    wordTwo = "Twenty";
                    break;
                case 3:
                    wordTwo = "Thirty";
                    break;
                case 4:
                    wordTwo = "Forty";
                    break;
                case 5:
                    wordTwo = "Fifty";
                    break;
                case 6:
                    wordTwo = "Sixty";
                    break;
                case 7:
                    wordTwo = "Seventy";
                    break;
                case 8:
                    wordTwo = "Eighty";
                    break;
                case 9:
                    wordTwo = "Ninety";
                    break;
                default:
                    wordTwo = "";
                    System.out.println("out of ability");
            }
            switch (tens) {
                case 1:
                    wordThree = "One hundred";
                    break;
                case 2:
                    wordThree = "One hundred";
                    break;
                case 3:
                    wordThree = "Two hundred";
                    break;
                case 4:
                    wordThree = "Three hundred";
                    break;
                case 5:
                    wordThree = "Four hundred";
                    break;
                case 6:
                    wordThree = "Five hundred";
                    break;
                case 7:
                    wordThree = "Six hundred";
                    break;
                case 8:
                    wordThree = "Eight hundred";
                    break;
                case 9:
                    wordThree = "Nine hundred";
                    break;
                default:
                    wordThree = "";
                    System.out.println("out of ability");
            }
            System.out.printf(wordThree + " and " + wordTwo + " " + wordOne);
        }
    }
}

