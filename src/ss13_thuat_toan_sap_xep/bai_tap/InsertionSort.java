package ss13_thuat_toan_sap_xep.bai_tap;

public class InsertionSort {
    static int[] arrayNumber = {5, -2, 4, 5, 9, 2, 1};

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
        insertionSort(arrayNumber);
        System.out.println("\nYour input list after sort: ");
        for (int i = 0; i < arrayNumber.length; i++) {
            System.out.print(arrayNumber[i] + " ");
        }
    }
}
