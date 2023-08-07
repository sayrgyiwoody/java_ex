package chapter_9;

import java.util.Scanner;
import java.util.StringTokenizer;

public class ex_20 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a string or blank to exit: ");
        String str = scn.nextLine();

        while(str.length() != 0) {
            StringTokenizer st = new StringTokenizer(str," ");

            String finalRev = "";
            while(st.hasMoreTokens()){
                StringBuffer bf = new StringBuffer(st.nextToken());
                StringBuffer revBf = bf.reverse();
                finalRev += revBf + " ";
            }
            System.out.println("Reverse string with StringTokenizer : " + finalRev);

        System.out.println("Enter a string or blank to exit: ");
        str = scn.nextLine();
        }

        System.out.println("End of program.");

    }
}
