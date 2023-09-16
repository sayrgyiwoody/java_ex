package chapter_9;

import java.util.Scanner;

public class ex_13 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a letter : ");
        String str = scn.nextLine();
        int count =0;
        for (char c: str.toCharArray()){
            if (Character.isUpperCase(c)) {
                count ++;
            }
        }
        
        System.out.println("Number of Upper Case Letter in String : " + count);
    }
}
