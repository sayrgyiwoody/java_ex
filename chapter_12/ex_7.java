package chapter_12;
import java.io.*;
public class ex_7 {
    public static void main(String[] args) {
        try {
            String str = "";
            File readFile = new File("ex_6.txt");
            FileReader freader = new FileReader(readFile);
            BufferedReader br = new BufferedReader(freader);
            String shortestWord = null;
            String longestWord = null;
            int wordCount = 0;
            int totalLength = 0;

            while((str = br.readLine()) != null) {
                wordCount++;
                if(shortestWord == null || str.length() < shortestWord.length()) {
                    shortestWord = str;
                }
                if(longestWord == null || str.length() > longestWord.length()) {
                    longestWord = str;
                }
                totalLength += str.length();
            }
            br.close();

            if(wordCount > 0 ){ 
                double averageLength = totalLength / wordCount ;

                System.out.println("Shortest word : " + shortestWord);
                System.out.println("Longest word : " + longestWord);
                System.out.println("Average Length of words : " + averageLength);

                
            }else {
                System.out.println("No words found in the file");
            }

        }catch (IOException e) {
            System.out.println("Unexpected error occurred");
        }

    }
    


}
