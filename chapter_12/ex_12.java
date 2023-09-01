package chapter_12;

import java.io.*;
import java.util.Scanner;

public class ex_12 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

            System.out.print("Enter value of N : ");
            int N = scanner.nextInt();
            int random;

            PrintWriter pw = new PrintWriter(new FileWriter("integers.txt"));

            for(int i = 0 ; i< N ; i++) {
                random = (int) (Math.random() * 100);
                pw.println("Random number #" + (i+1) + " : " + random);
            }
            System.out.println("Generated " + N + " random numbers.");
            pw.close();
    }
}
