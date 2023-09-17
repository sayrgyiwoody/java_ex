package chapter_12;

import java.io.*;
import java.util.ArrayList;

public class ex_9 {
    public static void main(String[] args) {
        try{
            File file = new File("ex_8.txt");
            FileInputStream inFileStream = new FileInputStream(file);
            ObjectInputStream inObjectStream = new ObjectInputStream(inFileStream);
            
            ArrayList<String> readString = (ArrayList<String>) inObjectStream.readObject();

            for(String word : readString) {
                System.out.println(word);
            }
            
            inObjectStream.close();
        }catch (IOException | ClassNotFoundException e) {
            System.out.println("Error : " + e.getMessage());
        }
    }
}
