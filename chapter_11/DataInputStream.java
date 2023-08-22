package chapter_11;

import java.io.*;

public class DataInputStream {
    public static void main(String[] args) throws IOException {
        File file = new File("sample.txt");
        FileInputStream inFileStream = new FileInputStream(file);
        DataInputStream inDataStream = new DataInputStream(inFileStream);

        System.out.println(inDataStream.readInt());
        System.out.println(inDataStream.readLong());
    }
}
