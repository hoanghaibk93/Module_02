package ss15_IO_text_file.thuc_hanh;

import java.io.FileReader;

public class FileReaderExample {
    public static void main(String args[]) throws Exception {
        FileReader fr = new FileReader("D:\\123.txt");
        int i;
        while ((i = fr.read()) != -1) {
            System.out.print((char) i);
        }
        fr.close();
    }
}
