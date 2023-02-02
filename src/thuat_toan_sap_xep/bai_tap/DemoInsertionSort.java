package thuat_toan_sap_xep.bai_tap;

import java.util.Scanner;

public class DemoInsertionSort {

    public static void insertionSort(int[] array) {
        int pos, x;
        for (int i = 0; i < array.length; i++) {
            x = array[i];
            pos = i;
            while (pos > 0 && x < array[pos - 1]) {
                array[pos] = array[pos - 1];
                pos--;
            }
            array[pos] = x;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter list size:");
        int size = Integer.parseInt(scanner.nextLine());
        int[] list = new int[size];
        for (int i = 0; i < list.length; i++) {
            System.out.println("Enter a element " + (i + 1));
            list[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Your input list before sort: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        insertionSort(list);
        System.out.println("\nYour input list after sort: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }
}
