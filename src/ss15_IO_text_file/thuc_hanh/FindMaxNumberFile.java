package ss15_IO_text_file.thuc_hanh;

import java.io.*;
import java.util.Scanner;

public class FindMaxNumberFile {
    static public void readfile(String path) {
        File file = new File(path);
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            int max = 0;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                if (Integer.parseInt(line) > max) {
                    max = Integer.parseInt(line);
                }
            }
            bufferedReader.close();
            System.out.println("Max: ");
            System.out.println(max);

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
        FindMaxNumberFile.readfile(path);
    }
}
