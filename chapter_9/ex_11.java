package chapter_9;

import java.util.Scanner;

public class ex_11 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter string or blank to quit : ");
        String str = scn.nextLine();

        while(str.length()!=0){

            int aCount = 0 , eCount = 0 , iCount = 0 ,oCount = 0 , uCount = 0;
            for(char c : str.toCharArray()){
                switch(c) {
                    case 'a': aCount++; break;
                    case 'e': eCount++; break;
                    case 'i': iCount++; break;
                    case 'o': oCount++; break;
                    case 'u': uCount++; break;
                    default: continue;
                }
            }
            System.out.println("# of 'a' : " + aCount);
            System.out.println("# of 'e' : " + eCount);
            System.out.println("# of 'i' : " + iCount);
            System.out.println("# of 'o' : " + oCount);
            System.out.println("# of 'u' : " + uCount);

            System.out.println("Enter string or blank to quit : ");
            str = scn.nextLine();
        }
    }
}
