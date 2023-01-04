package ss02_array.bai_tap;

import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        int sizeOne, sizeTwo;
        int arrayOne[], arrayTwo[], arrayThree[];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size of the first array");
        sizeOne = Integer.parseInt(sc.nextLine());
        arrayOne = new int[sizeOne];
        for (int i = 0; i < sizeOne; i++) {
            System.out.println("Enter a element " + (i + 1) + " of the first array");
            arrayOne[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println("Enter a size of the second array");
        sizeTwo = Integer.parseInt(sc.nextLine());
        arrayTwo = new int[sizeTwo];
        for (int i = 0; i < sizeTwo; i++) {
            System.out.println("Enter a element " + (i + 1) + " of the second array");
            arrayTwo[i] = Integer.parseInt(sc.nextLine());
        }
        arrayThree = new int[sizeOne + sizeTwo];
        for (int i = 0; i < arrayThree.length; i++) {
            if (i < arrayOne.length) {
                arrayThree[i] = arrayOne[i];
            } else {
                arrayThree[i] = arrayTwo[i - arrayOne.length];
            }
        }
        System.out.println("New array after merging array: ");
        for (int i = 0; i < arrayThree.length; i++) {
            System.out.print(arrayThree[i] + "\t");
        }
    }
}
