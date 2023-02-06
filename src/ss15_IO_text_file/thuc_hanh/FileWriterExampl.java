package ss15_IO_text_file.thuc_hanh;

import java.io.FileWriter;

public class FileWriterExampl {
    public static void main(String args[]) {
        try {
            FileWriter fw = new FileWriter("D:\\123.txt");
            fw.write("Welcome to java. i love it");
            fw.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Success...");
    }
}
