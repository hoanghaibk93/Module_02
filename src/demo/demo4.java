package demo;

import java.lang.reflect.Array;
import java.util.Arrays;

public class demo4 {
    public static void main(String[] args) {
        int [] array = new int[] {2,5,6,3,8,10,34};
        int [] array2 = new int[] {2,5,6,3,8,10,34};
//        System.out.println(array.length);
//        int [] array2 = Arrays.copyOf(array,7);
//        int [] array3 = new int[10];
//        System.out.println(Arrays.toString(array2));
//        System.out.println(Arrays.toString(array3));
//        System.arraycopy(array,1,array3,2,5);
//        System.out.println(Arrays.toString(array3));
        //Arrays.sort(array);
        System.out.println(Arrays.binarySearch(array,3));
        System.out.println(Arrays.equals(array,array2));
    }
}
