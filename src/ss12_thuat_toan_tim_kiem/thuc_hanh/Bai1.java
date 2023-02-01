package ss12_thuat_toan_tim_kiem.thuc_hanh;

public class Bai1 {
    public static void main(String[] args) {
        String inputString ="Welcome";
        int[] frequentChar = new int[255];                         //{1}
        for (int i = 0; i < inputString.length(); i++) {           //{2}
            /* Tìm ví trí tương ứng của ký tự trong bảng ASCII */
            int ascii = (int) inputString.charAt(i);               //{3}
            /* Tăng giá trị tần suất */
            frequentChar[ascii] = frequentChar[ascii]+ 1;
//            System.out.println(frequentChar[ascii]);
//            System.out.println(ascii);
//            System.out.println(inputString.charAt(i));
        }
        int max = 0;                                             //{5}
        char character = (char) 255; /* empty character */      //{6}
        for (int j = 0; j < 255; j++) {                         //{7}
            if (frequentChar[j] > max) {                        //{8}
                max = frequentChar[j];                          //{9}
                character = (char) j;                           //{10}
            }
        }
        System.out.println("The most appearing letter is '" + character + "' with a frequency of " + max + " times");

    }
}
