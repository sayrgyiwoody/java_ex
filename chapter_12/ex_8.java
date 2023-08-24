package chapter_12;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ex_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            File outFile = new File("ex_8.txt");
            FileOutputStream outFileStream = new FileOutputStream(outFile);
            ObjectOutputStream outObjectStream = new ObjectOutputStream(outFileStream);
            ArrayList<String> stringList = new ArrayList<String>();
            while(true) {
                System.out.println("Enter word or STOP to exit : ");
                String input = scanner.nextLine().trim();

                if(input.equals("STOP")){
                    break;
                }
                stringList.add(input);
            }
            outObjectStream.writeObject(stringList);
            System.out.println("Words saved");
            outObjectStream.close();
        }catch (IOException e) {
            System.out.println("Error : " + e.getMessage());
        }

        
    }
}
