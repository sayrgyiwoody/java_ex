package chapter_6;

import java.util.Scanner;

public class ex_18 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Enter number greater than 0 or negative to stop : ");
        int num = scn.nextInt();

        while(num>=0) {
            numDigit num_digit = new numDigit(num);
            System.out.println("number of digit for " + num + " : " + num_digit.getDigit());

            System.out.println("Enter number greater than 0 or negative to stop : ");
            num = scn.nextInt();
        }
        



    }
}
