package chapter_8;

public class Finally {
    public static void main(String[] args) {
        try{
            int num = 10/0;
        }catch(ArithmeticException e){
            System.out.println(e);
        }finally{
            System.out.println("Finally executed");
        }
    }
}
