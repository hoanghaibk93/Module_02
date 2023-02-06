package ss15_IO_text_file.thuc_hanh;

import java.io.Console;

public class demo3 {
    public static void main(String args[]) {
        Console c = System.console();
        System.out.println("Enter your name: ");
        String n = c.readLine();
        System.out.println("Welcome " + n);
    }
}
