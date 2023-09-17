package chapter_9;

import java.util.*;

public class ex_21 {

    public static void main(String [] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter a string to test palindrome or leave blank to exit : ");
        String str = scn.nextLine();

        while(str.length() != 0) {
            StringBuffer bf = new StringBuffer(str);
            StringBuffer revBf = bf.reverse();

            if(str.equalsIgnoreCase(revBf.toString())){
                System.out.println("The String : " + str + " is a palindrome.");
            }else {
               System.out.println("The String : " + str + " is not a palindrome.");
            }

            System.out.println("Enter a string to test palindrome or leave blank to exit : ");
            str = scn.nextLine();
        }

        System.out.println("End of program.");
    }
}
