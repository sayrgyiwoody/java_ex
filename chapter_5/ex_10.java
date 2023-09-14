package chapter_5;

import java.util.Scanner;

public class ex_10 {
	public static void main(String[] args) {

		int height, recommendWeight;
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter your height in cm : ");
		height = scn.nextInt();
		if (height > 140 && height < 230 ) {
			recommendWeight =  height - 110;
			System.out.println("Recommended weight for " + height + " cm is " + recommendWeight);
		}
		else {
			System.out.println("Height must be between 140cm and 230cm");
		}
	}
}
