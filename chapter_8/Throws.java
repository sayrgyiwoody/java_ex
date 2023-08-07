package chapter_8;

import java.io.FileWriter;
import java.io.IOException;

public class Throws {
    public static void main(String[] args) throws IOException {
        FileWriter file = new FileWriter("D:\\Data1.txt");
        file.write("hello file writer object");
        file.close();
    }
}
