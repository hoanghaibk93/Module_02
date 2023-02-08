package ss17_string_regex.bai_tap.checkclassname;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckClassName {
    private static Pattern pattern;
    private Matcher matcher;
    //private static final String CLASS_REGEX = "^\\d{1,2}[-|/]\\d{1,2}[-|/]\\d{4}$";
    private static final String CLASS_REGEX = "^[CAP]\\d{4}\\w*[GHIKLM]$";

    public boolean checkClassName(String regex) {
        pattern = Pattern.compile(CLASS_REGEX);
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public static void main(String[] args) {
        CheckClassName checkClassName = new CheckClassName();
        Scanner scanner = new Scanner(System.in);
        boolean check;
        do {
            System.out.println("Enter class name");
            String className = scanner.nextLine();
            if (checkClassName.checkClassName(className)) {
                System.out.println("Class is " + className + " is valid: true ");
                check = false;
            } else {
                System.out.println("Class is " + className + " is valid: false ");
                check = true;
            }
        } while (check);
    }
}
