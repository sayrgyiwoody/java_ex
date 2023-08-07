package chapter_6;

import java.util.Scanner;

public class ex_17 {
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int low = 100, high = 1000 , num;

        for(int i = low+1 ; i<high ; i++){
            int sum = 0;
            int temp = i;
            while(temp>0) {
                int digit = temp % 10;
                sum += Math.pow(digit, 3);
                temp /= 10;
            }
            if(sum == i) {
                System.out.print(i + " ");
            }
        }

        

    }
    
    
}
