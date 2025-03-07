package File_IO;

import java.io.*;
public class FilterExample {
    public static void main(String[] args) {
        try {
            File data = new File("D:\\test.txt");
            FileOutputStream file = new FileOutputStream(data);
            FilterOutputStream filter = new FilterOutputStream(file);
            String s="Welcome to javaTpoint.";
            byte b[]=s.getBytes();
            filter.write(b);
            filter.flush();
            filter.close();
            file.close();
            System.out.println("Success...");

        }catch (Exception e) {
            System.out.println(e);
    }
}
}

