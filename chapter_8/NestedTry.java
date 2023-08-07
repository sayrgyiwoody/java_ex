package chapter_8;

public class NestedTry {
    public static void main(String[] args) {
        try{
            System.out.println("Nested Try Example ");
            try {
                int num = 10/0;

            }catch (ArithmeticException el){
                System.out.println(el);
            }
            try{
                String str = "";
                    System.out.println(str.charAt(8));
            }catch (StringIndexOutOfBoundsException el){
                System.out.println(el);
            }
            String st = null;
            System.out.println(st.length());
        }catch(ArithmeticException el) {
            System.out.println(el);
        }
    }
}
