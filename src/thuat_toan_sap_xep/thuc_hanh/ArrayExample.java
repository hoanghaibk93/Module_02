package thuat_toan_sap_xep.thuc_hanh;

import java.util.FormatFlagsConversionMismatchException;
import java.util.Random;
import java.util.Scanner;

public class ArrayExample {

    public static int[] createRandom() {
        int[] array = new int[10];
        Random random = new Random();
        System.out.println("Danh sach phan tu mang");
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1000);
            System.out.print(array[i] + " ");
        }
        return array;
    }

    public static void main(String[] args) {
        int[] arr = ArrayExample.createRandom();
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nnhap vao chi so ");
        try {
            int index = Integer.parseInt(scanner.nextLine());
            System.out.println("\nPhan tu co chi so: " + index + " la  " + arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ban nhap co chi so trong khoang tu 0 den 100" +e.getMessage());
        }

    }
}
