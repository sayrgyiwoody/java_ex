package chapter_9;

import java.util.Scanner;

public class ex_19 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter a letter or blank to exit : ");
        String str = scn.nextLine();


        while(str.length()!=0) {
            String newString = "";
            for (char c : str.toCharArray()) {
                if(Character.isUpperCase(c)){
                    newString += Character.toLowerCase(c);
                }else if(Character.isLowerCase(c)){
                    newString += Character.toUpperCase(c);
                }   
            }    
            System.out.println("Original String : " + str);
            System.out.println("New String : " + newString);
        
        System.out.println("Enter a letter or blank to exit : ");
        str = scn.nextLine();
        }
    }
}
