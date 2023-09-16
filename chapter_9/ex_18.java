package chapter_9;

import java.util.Scanner;

public class ex_18 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a string or blank to exit : ");
        String str = scn.nextLine();

        while(str.length()!=0) {
            int i = 0;
            while(i+2 < str.length()) {
                String codon = str.substring(i,i+3);
                System.out.println(codon);
                i+=3;
            }

        System.out.println("Enter a string or blank to exit : ");
        str = scn.nextLine();
        }
    }
}
