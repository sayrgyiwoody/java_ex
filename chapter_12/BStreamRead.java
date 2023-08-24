package chapter_12;

import java.io.*;

public class BStreamRead {
    public static void main(String[] args) {
        try {
            File file = new File("sample.txt");
            FileInputStream in = new FileInputStream(file);
            byte [] data = new byte[(int) file.length()];
            in.read(data);
            in.close();
            for(int i = 0 ; i< data.length ; i++) {
                System.out.print((char)data[i]); //abcde
            }
        }catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
