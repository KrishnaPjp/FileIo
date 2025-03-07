package File_IO;

import java.io.FileOutputStream;
import java.util.Scanner;

public class FileootpurStreamEx3 {
    public static void main(String[] args) {
     try{
         FileOutputStream fout=new FileOutputStream("D:\\test.txt");
         Scanner sc = new Scanner(System.in);
         System.out.println("enter name");
         String name =sc.nextLine();
         System.out.println("enter class");
         String standard =sc.nextLine();
         System.out.println("enter occupation");
         String occpestion =sc.nextLine();
         String s="Name= "+name+"\n" +
                 "class= "+standard+"\n" +
                 "occupation= "+occpestion+"\n";
         byte[]b=s.getBytes();
         fout.write(b);
         fout.close();
         System.out.println("Success");
     }catch (Exception e){
       System.out.println(e);
     }
    }
}
