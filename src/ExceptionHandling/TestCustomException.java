package ExceptionHandling;

class invilideageException extends Exception{
    public invilideageException(String str){
        super(str);

    }
}

public class TestCustomException {
    public  static void validateage(int age)throws invilideageException {
        if (age<18){
            System.out.println("invoilid");
            throw new invilideageException("not aligible for vote");
        }
        else {
            System.out.println("aligible");
        }

    }

    public static void main(String[] args) {
       try{
           validateage(15);
       } catch (invilideageException e) {
           System.out.println(e);
       }

    }
}