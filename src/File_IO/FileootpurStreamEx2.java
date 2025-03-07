package File_IO;

import java.io.FileOutputStream;

public class FileootpurStreamEx2 {
    public static void main(String[] args) {
     try{
         FileOutputStream fout=new FileOutputStream("D:\\test.txt");
         String s = "my name is krishna";
         byte[]b=s.getBytes();
         fout.write(b);
         fout.close();
         System.out.println("Success");
     }catch (Exception e){
       System.out.println(e);
     }
    }
}
