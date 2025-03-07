package File_IO;

import java.io.FileOutputStream;

public class FileootpurStreamEx {
    public static void main(String[] args) {
     try{
         FileOutputStream fout=new FileOutputStream("D:\\test.txt");
         fout.write(65);
         fout.close();
         System.out.println("Success");
     }catch (Exception e){
       System.out.println(e);
     }
    }
}
