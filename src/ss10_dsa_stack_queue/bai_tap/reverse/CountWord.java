package ss10_dsa_stack_queue.bai_tap.reverse;

import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountWord {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a text: ");
        String stringWord = scanner.nextLine();
        String[] stringArray = stringWord.toLowerCase().split(" ");
        Map<String, Integer> map = new TreeMap<>();
        for (int i = 0; i < stringArray.length; i++) {
            if (!(map.containsKey(stringArray[i]))) {
                map.put(stringArray[i], 1);
            } else {
                map.put(stringArray[i], map.get(stringArray[i]) + 1);
            }
        }
        System.out.println("Count of occurrences words in this text:");
        System.out.println(map);
    }
}
