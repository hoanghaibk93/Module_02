package ss15_IO_text_file.bai_tap.readcsvfile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadCsvFile {
    static final String pathFile = "D:\\04_hoc_tap\\codegym\\c1122g1\\module_02\\src\\ss15_IO_text_file\\bai_tap\\readcsvfile\\nation.csv";

    public static List<String> readCscFile() {
        List<String> list = new ArrayList<>();
        File file = new File(pathFile);
        if (!file.exists()) {
            try {
                throw new FileNotFoundException();
            } catch (FileNotFoundException e) {
                System.out.println("File not found");
            }
        }
        try {
            FileReader fileReader = new FileReader(pathFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                list.add(line);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    public static void main(String[] args) {
        List<String> list = ReadCsvFile.readCscFile();
        for (int i = 0; i < list.size(); i++) {
            int elementOne = Integer.parseInt(list.get(i).split(",")[0]);
            String elementTwo = list.get(i).split(",")[1];
            String elementThree = list.get(i).split(",")[2];
            System.out.println(elementOne + " " + elementTwo + " " + elementThree);
        }
    }
}

