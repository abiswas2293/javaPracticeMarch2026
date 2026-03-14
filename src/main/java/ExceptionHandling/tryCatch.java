package ExceptionHandling;

public class tryCatch {
   public static void main(String args[]){

        try{
        int b=0;
        int a=12/b;
        System.out.println("This line should not be printed");
    }
       catch(ArithmeticException e){
        System.out.println("Division by zero-that is giving exception");

    }

}}
