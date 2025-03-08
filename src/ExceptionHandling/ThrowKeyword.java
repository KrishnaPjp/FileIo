package ExceptionHandling;

import java.util.Scanner;

public class ThrowKeyword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number");
        int b = sc.nextInt();
        if (a==0||b==0){
            throw new RuntimeException(" Zero Not allowed");
        }
        int c=a/b;
        System.out.println(c);

    }
}
