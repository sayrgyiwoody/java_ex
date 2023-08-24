package chapter_12;

import java.io.*;

public class CharStreamRead {
    public static void main(String[] args) throws IOException {
        File file = new File("input.txt");
        FileReader reader = new FileReader(file);
        int temp;
        while((temp = reader.read()) != -1) {
            System.out.println((char)temp);
        }
        reader.close();
    }
}
