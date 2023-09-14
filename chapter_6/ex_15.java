package chapter_6;

import java.util.Scanner;

public class ex_15 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num;
        System.out.println("Enter number between 20 and 30 or 0 to continue next : ");
        num = scn.nextInt();
        while (num != 0) {
            if (num > 20 && num < 30) {
                 int divisor = 1;
                int sum = 0;
                while (divisor < num) {

                    if (num % divisor == 0) {
                        sum += divisor;
                    }
                    divisor++;
                }
                if (sum == num) {
                    System.out.println(num + " is a Perfect number");

                } else {
                    System.out.println(num + " is not a perfect number");
                }
                System.out.println("Enter number between 20 and 30 or 0 to continue next : ");
                num = scn.nextInt();
            }else {
                System.out.println("Invalid input ! Enter number between 20 and 30 or 0 to continue next : ");
                num = scn.nextInt();
            }
           
        }

        System.out.println("Enter number between 490 and 500 or 0 to quit: ");
        num = scn.nextInt();
        while (num != 0) {
            if (num > 490 && num < 500) {
                int divisor = 1;
                int sum = 0;
                while (divisor < num) {

                    if (num % divisor == 0) {
                        sum += divisor;
                    }
                    divisor++;
                }
                if (sum == num) {
                    System.out.println(num + " is a Perfect number");

                } else {
                    System.out.println(num + " is not a perfect number");
                }
                System.out.println("Enter number between 490 and 500 or 0 to quit: ");
                num = scn.nextInt();
            }else {
                System.out.println("Enter number between 490 and 500 or 0 to quit: ");
                num = scn.nextInt();
            }

        }

    }
}
