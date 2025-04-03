package exceptionHandling;

public class ExceptionExample {

    public static void main(String[] args){

        try {
            int a = 10;
            int b = 20;
            int result =a-b;
            System.out.println("Result: "+result);
        }catch(Exception e){
            e.printStackTrace();

        }
    }
}
