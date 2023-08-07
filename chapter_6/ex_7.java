package chapter_6;
import java.util.Scanner;

public class ex_7 {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter number greater than 0 : ");
		int num = scn.nextInt();
		while(num>0) {
			int divisor = 2;
			while(num%divisor != 0) {
				divisor ++;
			}
			if(num== divisor) {
				System.out.println(num + " is a prime number.");
			}else {
				System.out.println(num + " is not a prime number.");
			}
			
			System.out.println("Enter number greater than 0 : ");
			num = scn.nextInt();
		}
		
	}
}
