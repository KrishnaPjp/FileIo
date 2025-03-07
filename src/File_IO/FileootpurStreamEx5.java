package File_IO;

import java.io.FileInputStream;

public class FileootpurStreamEx5 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("D:\\test.txt");
            int i = 0;
            while ((i = fis.read()) != -1) {
                System.out.println((char) i);

            }
            fis.close();
        }catch (Exception e){
            System.out.print(e);
        }
    }
}