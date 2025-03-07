package File_IO;

import jdk.management.resource.internal.inst.FileOutputStreamRMHooks;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileootpurStreamEx6 {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("D:\\test.txt");
            BufferedOutputStream Bos=new BufferedOutputStream(fos);
            String s = "hello krishna ";
            byte []b= s.getBytes();
            Bos.write(b);
            Bos.flush();
            Bos.close();
            fos.close();
            System.out.println("success");



        }catch (Exception e){
            System.out.print(e);
        }
    }
}