package ss15_IO_text_file.thuc_hanh;

import java.io.Console;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class demo3 {
    public static void main(String args[]) {
        String s = "ABCD abc";
        byte[] b = s.getBytes(StandardCharsets.UTF_8);
        System.out.println(Arrays.toString(b));
    }
}
