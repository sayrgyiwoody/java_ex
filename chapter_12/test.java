package chapter_12;

import java.util.*;
import java.io.*;
import java.nio.Buffer;

public class test {
   public static void main(String[] args) {
     Scanner scn = new Scanner(System.in);

    try {

        BufferedReader br = new BufferedReader(new FileReader("integers.txt"));

        String str;

        while((str = br.readLine()) != null) {
            System.out.println(str);
        }
        

        br.close();
        
    }catch (IOException e) {
        System.out.println("Error : " + e.getMessage());
    }
   }

}
