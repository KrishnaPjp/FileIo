//package File_IO;
//
//import java.io.*;
//
//public class FilterInputStream {
//    public static void main(String[] args) {
//        try {
//            File data = new File("D:\\test.txt");
//            FileInputStream  file = new FileInputStream(data);
//            FilterInputStream filter = new BufferedInputStream(file);
//            int k =0;
//            while((k=filter.read())!=-1){
//                System.out.print((char)k);
//            }
//            file.close();
//            filter.close();
//        }catch (Exception e) {
//            System.out.println(e);
//
//        }
//}
//}