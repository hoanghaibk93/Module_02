package ss16_IO_Bbinary_serialization.thuc_hanh.bai1;

import java.io.*;

public class Copy {
  public static void copyFileUsingStream(File source, File dest) throws IOException {
    InputStream is;
    OutputStream os;
    is = new FileInputStream(source);
    os = new FileOutputStream(dest);
    byte[] buffer = new byte[1024];
    int length;
    while ((length = is.read(buffer))>0){
      os.write(buffer,0,length);
    }
    is.close();
    os.close();
  }
  public static void copyFileUsingCharacter(FileReader source, FileWriter dest) throws IOException {
    BufferedReader reader;
    BufferedWriter writer;
    reader = new BufferedReader(source);
    writer = new BufferedWriter(dest);
    String line;
    while ((line = reader.readLine())!= null ){
      writer.write(line);
      writer.newLine();
    }
    reader.close();
    writer.close();
    System.out.println("Copy finally");
  }

  public static void main(String[] args) throws IOException {
//    Scanner scanner = new Scanner(System.in);
//    System.out.println("Enter path source");
//    String pathSource = scanner.nextLine();
//    System.out.println("Enter path dest");
//    String pathDest = scanner.nextLine();
    File source = new File("D:\\04_hoc_tap\\codegym\\c1122g1\\module_02\\src\\ss16_IO_Bbinary_serialization\\thuc_hanh\\source.txt");
    File dest = new File("D:\\04_hoc_tap\\codegym\\c1122g1\\module_02\\src\\ss16_IO_Bbinary_serialization\\thuc_hanh\\dest.txt");
    //Copy.copyFileUsingStream(source,dest);
//    FileReader read = new FileReader(source);
//    FileWriter writer = new FileWriter(dest);
    FileReader read = new FileReader("D:\\04_hoc_tap\\codegym\\c1122g1\\module_02\\src\\ss16_IO_Bbinary_serialization\\thuc_hanh\\source.txt");
    FileWriter writer = new FileWriter("D:\\04_hoc_tap\\codegym\\c1122g1\\module_02\\src\\ss16_IO_Bbinary_serialization\\thuc_hanh\\dest.txt");
    Copy.copyFileUsingCharacter(read,writer);
  }
}
