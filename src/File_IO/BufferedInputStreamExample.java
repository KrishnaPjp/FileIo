package File_IO;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInputStreamExample {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("D:\\test.txt");
            BufferedInputStream bis = new BufferedInputStream(fis);
            int i = 0;
            while ((i = bis.read()) != -1) {
                System.out.print((char) i);

            }
            bis.close();
            fis.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}