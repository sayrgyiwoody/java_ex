package chapter_9;

import java.util.Scanner;

public class ex_15 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a letter : ");
        String str = scn.nextLine();

        // using for loop
        // String reverseStr = "";
        // for (int i = str.length()-1;i>=0;i--){
        // reverseStr += str.charAt(i);
        // }

        // using StringBuffer
        StringBuffer bf = new StringBuffer(str);
        StringBuffer revBf = bf.reverse();

        System.out.println("Reverse String : " + revBf);
    }

}
