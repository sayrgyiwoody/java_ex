package chapter_9;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ex_20 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a string or blank to exit: ");
        String str = scn.nextLine();

        while(str.length() != 0) {
            StringTokenizer st = new StringTokenizer(str," ");

            ArrayList<StringBuffer> finalRev = new ArrayList<StringBuffer>();
            while(st.hasMoreTokens()){
                StringBuffer bf = new StringBuffer(st.nextToken());
                StringBuffer revBf = bf.reverse();
                finalRev.add(revBf);
            }
            System.out.println("Reverse string with StringTokenizer : ");

            for(StringBuffer s : finalRev){
                System.out.print(s + " ");
            }

        System.out.println("\nEnter a string or blank to exit: ");
        str = scn.nextLine();
        }

        System.out.println("End of program.");

    }
}
