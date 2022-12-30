package ss01_introduction_to_java.bai_tap;

import java.util.Scanner;

public class UsdToVnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double usd, vnd;
        System.out.println("Enter a mount of Usd");
        usd = sc.nextDouble();
        vnd = usd * 23000;
        System.out.println(usd + " USD = " + vnd + " VND");
    }
}
