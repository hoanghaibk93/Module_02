package ss15_IO_text_file.thuc_hanh;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileMax {
    public static List<Integer> readFile(String path) throws IOException {
        List<Integer> list = new ArrayList<>();
        File file = new File(path);
        if (!file.exists()) {
            throw new FileNotFoundException();
        }
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line = "";
        while ((line = bufferedReader.readLine()) != null) {
            list.add(Integer.parseInt(line));
        }
        bufferedReader.close();
        return list;
    }

    public static int Max(List<Integer> list) {
        int max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (max < list.get(i)) {
                max = list.get(i);
            }
        }
        return max;
    }
    public static  void writeFile(String path, int max){
        try {
            FileWriter fileWriter = new FileWriter(path,true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("Giá trị lớn nhất là " + max);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static void main(String[] args) {
        System.out.println("Nhâp đường dẩn file: ");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        try {
            List<Integer>list = FileMax.readFile(path);
            int max =FileMax.Max(list);
            System.out.println("Max la:");
            System.out.println("Gia tri lon nhat là " + max);
            writeFile(path,max);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
