package ss02_array.bai_tap;

import java.util.Scanner;

public class DeleteOneElement {
    public static void main(String[] args) {
        int[] inputArray = {1, 2, 2, 6, 7, 9,5,9,2};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter element of array that you want delete it");
        int eleDelete = Integer.parseInt(sc.nextLine());
        deleteOneElement(inputArray, eleDelete);
    }

    public static void deleteOneElement(int[] array, int elementDelete) {
        int index = 0, count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == elementDelete) {
                index = i;
                count++;
                for (int j = index; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                }
                array[array.length - 1] = 0;
                i--;
            }
        }
        if (count == 0) {
            System.out.println("element have not in array");
        } else {
            System.out.println("Array after delete element of array: ");
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[j] + "\t");
            }
        }
    }
}

