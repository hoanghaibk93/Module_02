package ss12_thuat_toan_tim_kiem.bai_tap;

import java.util.LinkedList;
import java.util.Scanner;

public class FindIncreaseSubString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a string:");
        String string = scanner.nextLine();
        LinkedList<Character> max = new LinkedList<>();
        LinkedList<Character> list = new LinkedList<>();
        for (int i = 0; i < string.length(); i++) {
            if (list.size() > 0 && string.charAt(i) <= list.getLast()) {
                list.clear();
            }
            list.add(string.charAt(i));
            if (list.size() > max.size()) {
                max.clear();
                max.addAll(list);
            }
        }
        System.out.println("Increase continue SubString:");
        for (int i = 0; i < max.size(); i++) {
            System.out.print(max.get(i));
        }
    }
}
