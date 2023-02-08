package demo;

import java.util.StringTokenizer;

public class stringdemo {
    public static void main(String args[]) {
        StringTokenizer st = new StringTokenizer("Toi ten la   VietTut");
        System.out.println("Tổng số token: " + st.countTokens());
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}
