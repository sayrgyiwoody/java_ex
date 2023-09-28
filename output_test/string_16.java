package output_test;

public class string_16 {
    public static void main(String[] args) {
        String text = "Java Programming";

        System.out.println(text.substring(0, 4));
        System.out.println(text.length());
        System.out.println(text.substring(8, 12));
        System.out.println(text.substring(0, 1) + text.substring(7, 9));
        System.out.println(text.substring(5, 6) + text.substring(text.length()-3, text.length()));
    }
}
