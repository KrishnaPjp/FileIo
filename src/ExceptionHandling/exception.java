package ExceptionHandling;

import java.util.Scanner;

public class exception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        while (true) {
            System.out.println("Enter a number");
            int a = sc.nextInt();
            System.out.println("Enter a number");
            int b = sc.nextInt();
            try {
                int c = a / b;
                System.out.println(c);
                    } catch (Exception e) {
                System.out.println("you can not divide any number by 0");
            }


        }
    }
}
