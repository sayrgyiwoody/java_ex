package exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class TestBank {
    public static void main(String[] args) {
        // Bank[] bankArr = new Bank[10];
        ArrayList<Bank> bankArr = new ArrayList<Bank>();

        Scanner scanner = new Scanner(System.in);

        String name;
        long accNumber;
        double currBalance;

        for(int i = 0 ; i< 10; i++) {
            System.out.println("Enter name : " );
            name = scanner.next();

            //to avoid 2 question
            // scanner.nextLine();

            System.out.println("Enter Account Number : " );
            accNumber = scanner.nextLong();
            System.out.println("Enter Current Balance : " );
            currBalance = scanner.nextDouble();

            Bank bank = new Bank(name,accNumber,currBalance);
            bankArr.add(bank);

        }

2        for(Bank b : bankArr) {
            b.displayAccount();
        }

    }
}
