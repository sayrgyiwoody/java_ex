package chapter_12;

import java.io.*;

public class TestDataOutputStream {
    public static void main (String [] args) throws IOException {
        File file = new File("sample.txt");
        FileOutputStream outFileStream = new FileOutputStream(file);
        DataOutputStream outDataStream= new DataOutputStream(outFileStream);

        outDataStream.writeInt(10000);
        outDataStream.writeLong(11111111L);
        outDataStream.writeFloat(3333333F);
        outDataStream.writeDouble(33333333D);
        outDataStream.writeChar('A');

        outDataStream.close();

    }
}
