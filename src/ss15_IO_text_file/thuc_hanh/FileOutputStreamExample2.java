package ss15_IO_text_file.thuc_hanh;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileOutputStreamExample2 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fout = null;
        try {
            fout = new FileOutputStream("D:\\hoanghai.txt");
            String s = "Welcome to Java";
            byte b[] = s.getBytes();
            fout.write(b);
            fout.close();
            System.out.println("success....");
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            fout.close();
        }
    }
}

