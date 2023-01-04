package ss02_array.bai_tap;

import java.util.Scanner;

public class CountCharacterOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String character;
        String inputString;
        int count = 0;
        System.out.println("Enter a String");
        inputString = sc.nextLine();
        System.out.println("Enter a character that you want to find: ");
        character = sc.nextLine();
        for (int i = 0; i < inputString.length(); i++) {
            if (Character.toString(inputString.charAt(i)).equals(character)) {
                count++;
            }
        }
        System.out.println("count: " + count);
    }
}
