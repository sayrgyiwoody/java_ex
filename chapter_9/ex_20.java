package chapter_9;

import java.util.*;
public class ex_20 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter a string or blank to exit : ");
        String str = scn.nextLine();

        while(str.length() != 0) {

            StringTokenizer st = new StringTokenizer(str," ");

            ArrayList<StringBuffer> finalRev = new ArrayList<StringBuffer>();

            while(st.hasMoreTokens()){
                StringBuffer bf = new StringBuffer(st.nextToken());
                StringBuffer rf = bf.reverse();
                finalRev.add(bf);
            }

            System.out.println("Reverse String with StringTokenizer : ");

            for(StringBuffer c : finalRev){
                System.out.print(c+ " ");
            }

            System.out.println("\nEnter a string or blank to exit : ");
            str = scn.nextLine();
        }

        System.out.println("End of Program");
    }
    
}
