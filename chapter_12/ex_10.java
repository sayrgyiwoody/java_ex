package chapter_12;

import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ex_10 {
    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter value of N : ");
            int N = scanner.nextInt();
            int [] numbers = new int[N];

            for(int i = 0 ;i < N ; i++){
                numbers[i] = (int) (Math.random() * 100); //generate random integer between 0 and 99
            }

            FileOutputStream outFileStream = new FileOutputStream("ex_10.txt");
            DataOutputStream outDataStream = new DataOutputStream(outFileStream);

            //write to text file
            for(int i = 0 ; i < N ; i++){
                outDataStream.writeInt(numbers[i]);
            }

            outDataStream.close();

            System.out.println("Random integers generated and stored in text file.");

        }catch(IOException e){
            System.out.println("Error : " + e.getMessage());
        }
    }
}
