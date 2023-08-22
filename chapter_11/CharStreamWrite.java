package chapter_11;
import java.io.*;

public class CharStreamWrite {
    public static void main(String[] args) throws IOException {

        FileWriter writer = null;
        try {
            File file = new File("input.txt");
            writer = new FileWriter(file);
            char chars[] = {'a','b','c','d','e'};
            writer.write(chars);
            System.out.println("Data successfully written in file");
        }finally {
            if(writer != null) {
                writer.close();
            }
        }
    }
}
