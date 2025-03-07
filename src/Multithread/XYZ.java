package Multithread;
class MyThread1 extends Thread{
    @Override
    public void run(){
        int i=0;
        while (i<2000){
            System.out.println("My thread is running");
            System.out.println("I am Happy");
            i++;
        }
    }
}
class MyThread2 extends Thread{
    @Override
    public void run(){
        int i=0;
        while (i<2000){
            System.out.println("My thread 2 is good");
            System.out.println("I sad");
            i++;
        }
    }
}

public class XYZ {
    public static void main(String[] args) {
    MyThread1 t1 = new MyThread1();
    MyThread2 t2 = new MyThread2();
    t1.start();
    t2.start();

    }
}
