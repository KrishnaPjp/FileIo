package File_IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class FileootpurStreamEx4 {
    public static void main(String[] args) {
     try{
         FileInputStream fis=new FileInputStream("D:\\test.txt");
         int i = fis.read();
         System.out.println((char)i);
       fis.close();


     }catch (Exception e){
       System.out.println(e);
     }
    }
}
