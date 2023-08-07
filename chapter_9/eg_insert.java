package chapter_9;

public class eg_insert {
    public static void main(String[] args) {
        StringBuffer s1 = new StringBuffer("Hello");
        System.out.println(s1.append("Java"));

        StringBuffer s2 = new StringBuffer("Welcome");
        System.out.println(s2.insert(1, s1));
        System.out.println(s2.replace(1, 5, " "));

        StringBuffer s3 = new StringBuffer("University");
        System.out.println(s3.delete(2, 5));
        System.out.println(s3.reverse());
        }
}
