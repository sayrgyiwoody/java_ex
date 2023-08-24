package chapter_12;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ex_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        try {
            PrintWriter pw = new PrintWriter(new FileWriter("ex_6.txt"));

            while(true) {
                System.out.println("Enter input or STOP to exit");
                String input = scanner.nextLine().trim();

                //case-sensitive check to exit the loop
                if (input.equals("STOP")) {
                    break;
                }

                // write the word to the file 
                pw.println(input);
            }

            pw.close();
            System.out.println("Words have been saved");
        }catch(IOException e) {
            System.out.println("Error : " + e.getMessage());
        }finally {
            scanner.close();
        }
        

    }


}
