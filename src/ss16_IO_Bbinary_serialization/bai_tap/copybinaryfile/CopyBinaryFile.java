package ss16_IO_Bbinary_serialization.bai_tap.copybinaryfile;

import java.io.*;

public class CopyBinaryFile {
    private static void copyBinaryFile(File source, File target) {
        FileInputStream read;
        FileOutputStream write;
        if (!source.exists()) {
            try {
                throw new FileNotFoundException();
            } catch (FileNotFoundException e) {
                System.out.println("File not found");
            }
        }
        if (target.exists()) {
            try {
                throw new Exception();
            } catch (Exception e) {
                System.out.println("Target file is already exist");
            }
        }
        try {
            read = new FileInputStream(source);
            write = new FileOutputStream(target);
            int sum = 0;
            int totalByte = read.available();
            byte[] buffer = new byte[totalByte];
            int length;
            while ((length = read.read(buffer)) > 0) {
                write.write(buffer, 0, length);
                sum = sum+ length;
            }
            System.out.println("Total of byte in file: " + totalByte);
            System.out.println("Copy file success");
            write.close();
            read.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        final String PATH_SOURCE = "D:\\04_hoc_tap\\codegym\\c1122g1\\module_02\\src\\ss16_IO_Bbinary_serialization\\bai_tap\\copybinaryfile\\filesource.txt";
        final String PATH_TARGET = "D:\\04_hoc_tap\\codegym\\c1122g1\\module_02\\src\\ss16_IO_Bbinary_serialization\\bai_tap\\copybinaryfile\\filetarget.txt";
        File fileSource = new File(PATH_SOURCE);
        File fileTarget = new File(PATH_TARGET);
        copyBinaryFile(fileSource, fileTarget);
    }
}

