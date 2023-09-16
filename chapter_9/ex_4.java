package chapter_9;

public class ex_4 {
    public static void main(String[] args) {
        StringBuffer word1, word2;
        word1 = new StringBuffer("Lisa");
        word2 = word1;
        word2.insert(0, "Mona ");
        System.out.println(word1);
    }
}
