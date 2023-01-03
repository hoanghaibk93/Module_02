package ss02_array.thuc_hanh;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] array = {"hai", "hoang", "pham", "tran"};
        System.out.println("Enter a name: ");
        String name = sc.nextLine();
        boolean flag = false;
        int i;
        for (i = 0; i < array.length; i++) {
            if (array[i].equals(name)) {
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println("Index of " + name + " in array: " + i);
        } else {
            System.out.println("name is not a array");
        }
    }
}