package ss02_array.bai_tap;

import java.util.Scanner;

public class FindMaxElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sizeN, sizeM, indexMaxN = 0, indexMaxM = 0;
        System.out.println("Enter a sizeN");
        sizeN = Integer.parseInt(sc.nextLine());
        System.out.println("Enter a sizeM");
        sizeM = Integer.parseInt(sc.nextLine());
        double[][] array = new double[sizeN][sizeM];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Enter element of array (index :) " + "[" + i + "]" + "[" + j + "]");
                array[i][j] = Double.parseDouble(sc.nextLine());
            }
        }
        System.out.println("");
        System.out.println("Element two-dimensional array");
        for (int i = 0; i < array.length; i++) {
            System.out.println("");
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
        }
        double max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                    indexMaxN = i;
                    indexMaxM = j;
                }
            }
        }
        System.out.println("\nthe biggest element of array is " + max + " with index " + "[" + indexMaxN + "]" + "[" + indexMaxM + "]");
    }
}

