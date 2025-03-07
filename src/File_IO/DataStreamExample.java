package File_IO;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;

public class DataStreamExample {
    public static void main(String[] args) {
        try {
            FileOutputStream  fis = new FileOutputStream("D:\\test.txt");
            FileOutputStream fis2 = new  FileOutputStream("D:\\test2.txt");
            ByteArrayOutputStream bout=new ByteArrayOutputStream();

            bout.write(65);
            bout.writeTo(fis);
            bout.writeTo(fis2);


            bout.flush();
            bout.close();
            System.out.println("Success...");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
