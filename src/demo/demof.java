package demo;

import java.util.Arrays;

public class demof {
    public static void main(String[] args) {
        int count = 0;
        String string = "123    456";
        String[] strings = string.split("");
        System.out.println(Arrays.toString(strings));
        System.out.println(strings.length);
        System.out.println(string.length());
        for (int i = 0; i < strings.length; i++) {
            if(strings[i].equals(" ")){
                count++;
            }
        }
        System.out.println(count);
        System.out.println(strings.length);
    }
}
