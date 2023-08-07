
package chapter_6;

import java.util.*;
import java.util.Scanner;

public class ex_13 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a positive number greater than 2 : ");
        int num = scn.nextInt();
        while(num > 2) {
            Date startTime = new Date();
            int count = 0;
            
            for (int i = 2; i<num; i++) {
                int divisor = 2;
                while(i%divisor != 0) {
                    divisor++;
                }
                if(i == divisor ) {
                    count++;
                }
            }
            Date endTime = new Date();
            double executionTime = endTime.getTime() - startTime.getTime();
            System.out.println(executionTime/1000 + " s");
            System.out.println("Prime number between 2 and " + num + " : " + count);
            System.out.println("Enter a positive number greater than 2 : ");
            num = scn.nextInt();
        }
    }
}
