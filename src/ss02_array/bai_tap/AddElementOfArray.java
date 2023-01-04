package ss02_array.bai_tap;

import java.util.Scanner;

public class AddElementOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size, position, elementAdd;
        System.out.println("Enter a size of array");
        size = Integer.parseInt(sc.nextLine());
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter element " + (i + 1) + " of array");
            array[i] = Integer.parseInt(sc.nextLine());
        }
        do {
            System.out.println("Enter a position you want add: ");
            position = Integer.parseInt(sc.nextLine());
            if (position < 0 || position > array.length - 1) {
                System.out.println("element is not added to the array");
            }
        } while (position < 0 || position > array.length - 1);

        System.out.println("Enter a element you want add: ");
        elementAdd = Integer.parseInt(sc.nextLine());
        int[] arrayTwo = new int[size + 1];
        for (int i = 0; i < arrayTwo.length; i++) {
            if (i < position) {
                arrayTwo[i] = array[i];
            } else if (i == position) {
                arrayTwo[position] = elementAdd;
            } else {
                arrayTwo[i] = array[i - 1];
            }
        }
        System.out.println("Array after add element of array");
        for (int i = 0; i < arrayTwo.length; i++) {
            System.out.print(arrayTwo[i] + "\t");
        }
    }
}
