package File_IO;

import java.io.FileInputStream;
import java.io.SequenceInputStream;

public class InputStreamExample {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("D:\\test.txt");
            FileInputStream fis2 = new FileInputStream("D:\\test2.txt");
            SequenceInputStream inst = new SequenceInputStream(fis, fis2);
            int j;
            while ((j = inst.read()) != -1) {
                System.out.print((char) j);
            }
            inst.close();
            fis.close();
            fis2.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
