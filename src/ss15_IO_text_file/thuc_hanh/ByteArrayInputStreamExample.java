package ss15_IO_text_file.thuc_hanh;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class ByteArrayInputStreamExample {
    public static void main(String[] args) throws IOException {
        ByteArrayInputStream bis = null;

        try {
            byte[] buf = { 35, 36, 37, 38 };
            // Create the new byte array input stream
            bis = new ByteArrayInputStream(buf);
            int k = 0;
            while ((k = bis.read()) != -1) {
                // Conversion of a byte into character
                char ch = (char) k;
                System.out.println("ASCII value of Character is:" + k + "; "
                        + "Special character is: " + ch);
            }
        } finally {
            bis.close();
        }
    }
}
