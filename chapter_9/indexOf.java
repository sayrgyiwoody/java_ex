package chapter_9;

public class indexOf {
    public static void main(String[] args) {
        String s6 = "University of Computer Studies Yangon : Computer Science";
        System.out.println(s6.length());
        System.out.println(s6.indexOf('o'));
        System.out.println(s6.indexOf("Computer",20));

        System.out.println(s6.charAt(40));
        System.out.println(s6.lastIndexOf('i'));
        System.out.println(s6.charAt(27));
    }
}
