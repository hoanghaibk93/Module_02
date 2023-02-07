package ss15_IO_text_file.thuc_hanh;

import java.io.FileOutputStream;
import java.io.IOException;

public class demo4 {
    public static void main(String args[]) throws IOException {
        FileOutputStream fout = null;
        try {
            fout = new FileOutputStream("D:\\conhoanfhau.txt");
            fout.write(65);
            fout.close();
            System.out.println("success...");
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            // close file output stream
            fout.close();
        }
    }
}
