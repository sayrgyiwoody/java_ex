package chapter_9;

import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = scn.nextInt();

        int factorial = 1;
        for(int i = 1; i <= num ; i++){
            factorial *= i;
        }

        System.out.println("Factorial : " + factorial);

    }
}
