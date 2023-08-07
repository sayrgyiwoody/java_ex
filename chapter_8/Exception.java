package chapter_8;

public class Exception {
    public static void main(String[] args) {

        try{
            int num = 100/0;

        }catch(ArithmeticException e){
            System.out.println(e);
        }

        System.out.println("Java Exception Example");
    }
}
