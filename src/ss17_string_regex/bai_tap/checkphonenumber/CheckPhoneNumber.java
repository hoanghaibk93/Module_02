package ss17_string_regex.bai_tap.checkphonenumber;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckPhoneNumber {
    private Pattern pattern;
    private Matcher matcher;
    static final String PHONENUMBER_GEGEX = "^[(][0-9]{2}[)][-][(][0][0-9]{9}[)]$";

    public boolean checkPhoneNumber(String regex) {
        pattern = Pattern.compile(PHONENUMBER_GEGEX);
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public static void main(String[] args) {
        CheckPhoneNumber checkPhoneNumber = new CheckPhoneNumber();
        Scanner scanner = new Scanner(System.in);
        boolean check;
        do {
            System.out.println("Enter a phone number");
            String phoneNumber = scanner.nextLine();
            if (checkPhoneNumber.checkPhoneNumber(phoneNumber)) {
                System.out.println("Phone number is " + phoneNumber + " is valid: true ");
                check = false;
            } else {
                System.out.println("Phone number is " + phoneNumber + " is valid: false");
                check = true;
            }
        } while (check);
    }
}
