package ss01_introduction_to_java.bai_tap;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ReadNumberToCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        String wordOne, wordTwo, wordThree;


        System.out.println("Enter a number");
        number = sc.nextInt();
        if (number < 10 && number >= 0) {
            switch (number) {
                case 0:
                    wordOne = "Zero";
                    break;
                case 1:
                    wordOne = "One";
                    break;
                case 2:
                    wordOne = "Two";
                    break;
                case 3:
                    wordOne = "Three";
                    break;
                case 4:
                    wordOne = "Four";
                    break;
                case 5:
                    wordOne = "Five";
                    break;
                case 6:
                    wordOne = "Six";
                    break;
                case 7:
                    wordOne = "Seven";
                    break;
                case 8:
                    wordOne = "Eight";
                    break;
                case 9:
                    wordOne = "Nine";
                    break;
                case 10:
                    wordOne = "Ten";
                    break;
                default:
                    wordOne = "";
                    System.out.println("out of ability");
                    break;
            }
            System.out.println(wordOne);
        } else if (number < 20) {
            int ones = number % 10;
            switch (ones) {
                case 0:
                    wordOne = "Ten";
                    break;
                case 1:
                    wordOne = "Eleven";
                    break;
                case 2:
                    wordOne = "Twelve";
                    break;
                case 3:
                    wordOne = "Thirteen";
                    break;
                case 4:
                    wordOne = "Fourteen";
                    break;
                case 5:
                    wordOne = "Fifteen";
                    break;
                case 6:
                    wordOne = "Sixteen";
                    break;
                case 7:
                    wordOne = "Seventeen";
                    break;
                case 8:
                    wordOne = "Eighteen";
                    break;
                case 9:
                    wordOne = "Nineteen";
                    break;
                default:
                    wordOne = "";
            }
            System.out.println(wordOne);
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
            }

            switch (tens) {
                case 1:
                    wordTwo = "Ten";
                    break;
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
            }
            switch (twos) {
                case 1:
                    wordThree = "One hundred";
                    break;
                case 2:
                    wordThree = "Two hundred";
                    break;
                case 3:
                    wordThree = "Three hundred";
                    break;
                case 4:
                    wordThree = "Four hundred";
                    break;
                case 5:
                    wordThree = "Five hundred";
                    break;
                case 6:
                    wordThree = "Six hundred";
                    break;
                case 7:
                    wordThree = "Seven hundred";
                    break;
                case 8:
                    wordThree = "Eight hundred";
                    break;
                case 9:
                    wordThree = "Nine hundred";
                    break;
                default:
                    wordThree = "";
            }
            System.out.printf(wordThree + " and " + wordTwo + " " + wordOne);
        }
    }
}


