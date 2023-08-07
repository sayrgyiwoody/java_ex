package chapter_9;

public class eg_3 {
    public static void main(String[] args) {
        String s8 = "Java Programming";
        System.out.println(s8.replaceAll("a", "b"));

        String s13 = "My .com is java.com";
        String s14 = s13.replaceAll(".com", ".net");
    
        System.out.println(s14);

        String s11 = "University of Computer Studies , Yangon";
        // String s12 = s11.replaceAll("(.*)Computer(.*)", "Computer University");     
        String s12 = s11.replaceAll("(.*)Computer(.*)", "UCSY");     


        System.out.println(s12);
        
        }
}
