package chapter_12;

import java.io.*;
import java.util.Scanner;

public class ex_11 {
    public static void main(String[] args) {

        try {
            int num;
            FileInputStream inFileStream = new FileInputStream("ex_10.txt");
            DataInputStream inDataStream = new DataInputStream(inFileStream);

            while(true) {
                System.out.println(inDataStream.readInt());
            }

        }catch(FileNotFoundException e){
            System.out.println("Error : " + e.getMessage());
        }catch(IOException e){
            System.out.println("Error : " + e.getMessage());
        }

        
    }
}
