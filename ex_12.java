import java.util.*;

public class ex_12 {
	public static void main(String args[]) {
		int year;
		Scanner scn = new Scanner(System.in) ;
		System.out.print("Enter year : ");
		year = scn.nextInt();
		
		if(((year%4==0) && (year%100 != 0)) || year %400 == 0) {
			System.out.println(year + " is a leap year");
		}else {
			System.out.println(year + " is not a leap year.");
		}
	}
}
