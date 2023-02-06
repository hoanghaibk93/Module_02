package ss15_IO_text_file.bai_tap.copyfiletext;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CopyFiletText {
    private static final String SOURCEFILEPATH = "D:\\04_hoc_tap\\codegym\\c1122g1\\module_02\\src\\ss15_IO_text_file\\bai_tap\\copyfiletext\\sourcefile.txt";
    private static final String SOURCETARGETPATH = "D:\\04_hoc_tap\\codegym\\c1122g1\\module_02\\src\\ss15_IO_text_file\\bai_tap\\copyfiletext\\targetfile.txt";

    public static List readFile(String sourceFilepath) {
        List<String> list = new ArrayList<>();
        File file = new File(sourceFilepath);
        if (!file.exists()) {
            try {
                throw new FileNotFoundException();
            } catch (FileNotFoundException e) {
                System.out.println("File not Found");
            }
        }
        try {
            String line = "";
            FileReader fileReader = new FileReader(sourceFilepath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
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

    public static void writeFile(String targetFilePath, List<String> list) {
        File file = new File(targetFilePath);
        if (file.exists()) {
            try {
                throw new Exception();
            } catch (Exception e) {
                System.out.println("Target file already exists");
            }
        }
        try {
            FileWriter fileWriter = new FileWriter(targetFilePath);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            int sum = 0;
            for (int i = 0; i < list.size(); i++) {
                bufferedWriter.write(list.get(i));
                bufferedWriter.newLine();
                sum = sum + list.get(i).length();
            }
            bufferedWriter.write("Number of character in this Source File = " + sum);
            System.out.println("Number of character in this Source File = " + sum);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        List<String> list = CopyFiletText.readFile(SOURCEFILEPATH);
        for (String element : list) {
            System.out.println(element);
        }
        CopyFiletText.writeFile(SOURCETARGETPATH, list);
    }

}
