package File_IO;
import java.io.*;
public class FileDemo2 {
    public static void main(String[] args) {
        String path = "";
        boolean bool = false;
        try {

            File file  = new File("D:\\test4.txt");
            file.createNewFile();
            System.out.println(file);
            File file2 = file.getCanonicalFile();
            System.out.println(file2);
            bool = file2.exists();
            path = file2.getAbsolutePath();
            System.out.println(bool);
            if (bool) {

                System.out.print(path + " Exists? " + bool);
            }
        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}
