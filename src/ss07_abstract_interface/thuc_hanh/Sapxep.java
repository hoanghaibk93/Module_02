package ss07_abstract_interface.thuc_hanh;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sapxep  {
    public static void main(String[] args) {
        //Arrays arrays = new Arrays();
        int[] array = {4, 2, 5, 10, 6};
        String[]array2 = {"b","d","a","A","B","C"};
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] +"\t");
        }
        Arrays.sort(array2);
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] +"\t");
        }
    }
}
