package File_IO;
import java.io.*;

public class FileExample {
    public static void main(String[] args) {
        File f=new File("D:\\");
        String filenames[]=f.list();
        for(String filename:filenames){
            System.out.println(filename);
        }
    }
}
