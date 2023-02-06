package ss15_IO_text_file.thuc_hanh;

import java.io.*;
import java.util.Scanner;

public class readFileTextDemo {
    public static void readFileText(String filePath) {
        File file = new File(filePath);
        if (!file.exists()) {
            try {
                throw new FileNotFoundException();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            int sum = 0;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            br.close();
            System.out.println("Tổng =" + sum);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        System.out.println("Nhâp đường dẩn file: ");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        readFileTextDemo.readFileText(path);
    }
}
