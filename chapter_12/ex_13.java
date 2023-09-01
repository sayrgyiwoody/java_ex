package chapter_12;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ex_13 {
    public static void main(String[] args) throws IOException{
        String str ;
        BufferedReader br = new BufferedReader(new FileReader("integers.txt"));

        while((str = br.readLine()) != null) {
            System.out.println(str);
        }

        br.close();
    }
}
