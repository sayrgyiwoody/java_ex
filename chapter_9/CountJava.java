package chapter_9;

import java.util.Scanner;

public class CountJava {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int javaCount = 0;
        String word;
        while(true){
            System.out.println("Enter sentence : ");
            word = scn.next();
            if(word.equalsIgnoreCase("java")){
                javaCount++;
            }else if(word.equals("stop")){
                break;
            }
        }
        System.out.println("Java count : "+ javaCount);
    }
}
