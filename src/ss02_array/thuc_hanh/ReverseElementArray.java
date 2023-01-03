package ss02_array.thuc_hanh;

import java.util.Scanner;

public class ReverseElementArray {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter a size");
            number = Integer.parseInt(sc.nextLine());
            if (number > 20) {
                System.out.println("Size dose not exceed 20");
            }
        } while (number > 20);
        int[] array = new int[number];
        System.out.println("Enter elements of array");
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.print("Elements in array: \n");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        System.out.println("\n Array after reverse: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
    }
}
