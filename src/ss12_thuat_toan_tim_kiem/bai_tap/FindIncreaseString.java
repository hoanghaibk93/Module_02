package ss12_thuat_toan_tim_kiem.bai_tap;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class FindIncreaseString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a string:");
        String string = scanner.nextLine();
        LinkedList<Character> max = new LinkedList<>();
        LinkedList<Character> list = new LinkedList<>();
        for (int i = 0; i < string.length(); i++) {
            list.add(string.charAt(i));
            for (int j = i + 1; j < string.length(); j++) {
                if (string.charAt(j) > list.getLast()) {
                    list.add(string.charAt(j));
                }
            }
            if (list.size() > max.size()) {
                max.clear();
                max.addAll(list);
            }
            list.clear();
        }
        System.out.println("Increase SubString:");
        for (int i = 0; i < max.size(); i++) {
            System.out.print(max.get(i));
        }
    }
}
