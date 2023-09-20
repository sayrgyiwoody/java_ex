package chapter_9;

import java.util.*;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = scn.nextInt();

        int first = 0 , second = 1, next = 0;

        for(int i = 0; i< num ; i++){
            System.out.print(first + " ");

            next = first + second;

            first = second;
            second = next;
        }

    }
}
