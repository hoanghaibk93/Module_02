package ss12_thuat_toan_tim_kiem.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    static int binarySearch(int[] array, int left, int right, int value) {
        while (left <= right) {
            int middle = (left + right) / 2;
            if (array[middle] == value) {
                return middle;
            } else if (value > array[middle]) {
                left = middle + 1;
            } else
                right = middle - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a length of ArrayNumber");
        int arrayLength = Integer.parseInt(scanner.nextLine());
        int[] arrayNumber = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            System.out.println("Input element " + (i + 1));
            arrayNumber[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Input a value that you want find");
        int value = Integer.parseInt(scanner.nextLine());
        Arrays.sort(arrayNumber);
        System.out.println(binarySearch(arrayNumber, 0, (arrayNumber.length - 1), value));
    }
}
