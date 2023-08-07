package chapter_9;

import java.util.Scanner;

public class ex_21 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a letter or blank to exit: ");
        String str = scn.nextLine();

        while(str.length() != 0) {
            
        // using StringBuffer
        StringBuffer bf = new StringBuffer(str);
        StringBuffer revBf = bf.reverse();

        // using equalsIgnoreCase to check 
        if (str.equalsIgnoreCase(revBf.toString())) {
            System.out.println("The String is Palindrome");
        }else {
            System.out.println("The String is not Palindrome");
        }

        System.out.println("Enter a letter or blank to exit: ");
        str = scn.nextLine();

        }

        System.out.println("End of program.");
    }

}
