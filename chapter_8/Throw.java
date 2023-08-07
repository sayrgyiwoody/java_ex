package chapter_8;

public class Throw {
    public static void main(String[] args) {
        int num = 34;
        if(num<50) {
            throw new ArithmeticException("not pass");
        }else {
            System.out.println("Pass");
        }
    }
}
