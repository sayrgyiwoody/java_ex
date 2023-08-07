package Exam;

import java.util.Scanner;

public class Computer {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String userInput;
        int count = 0;
        System.out.println("Enter computer or stop to stop the program : ");
        userInput = scn.next();

        while(true) {
            if(userInput.equalsIgnoreCase("computer")) {
                count++;
                System.out.println("user input : " + userInput + ", count : " + count );
            }else if(userInput.equals("stop")){
                break;
            }
            System.out.println("Enter computer or stop to stop the program : ");
            userInput = scn.next();
        }
        System.out.println("Program end , total count : " + count );
    }
}
