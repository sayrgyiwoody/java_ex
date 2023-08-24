package chapter_12;

import java.io.*;

public class BStreamWrite {
    public static void main(String[] args) {
        try{
            File file = new File("sample.txt");
            FileOutputStream out = new FileOutputStream(file);
            byte [] data = {97,98,99,100,101};//abcde
            out.write(data);
            out.close();
        }catch(IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
