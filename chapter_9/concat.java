package chapter_9;

public class concat {
    public static void main(String[] args) {
        String s5 = "Object Oriented";
        s5.concat("Programming");
        System.out.println(s5);
        s5 = s5.concat("Programming");
        System.out.println(s5);


        String str1 = "Object";
        String str2 = " Oriented";
        String str3 = " Programming";
        String str4 = str1.concat(str2).concat(str3);
        System.out.println(str4);

    }
}
