package output_test;

public class string_4 {
    public static void main(String[] args) {
        StringBuffer word1,word2;

        word1 = new StringBuffer("Lisa");
        word2 = word1;
        word1.insert(0,"Mona ");

        System.out.println(word1);
    }
}
