package chaper_5;
import java.util.*;
public class ex_13 {
	public static void main (String [] args) {
		Scanner scn = new Scanner(System.in);
		double wagePerHour = 7.25;
		double averageHour = 8;
		double numHour , totalSales,wage;
		double commission = 0;
		System.out.println("Enter number of hour worked : ");
		numHour = scn.nextDouble();
		System.out.println("Enter total sales : ");
		totalSales = scn.nextDouble();
		wage = numHour * wagePerHour;
		if(numHour > averageHour) {
			wage += (numHour - averageHour) * wagePerHour/2;
		}
		
		if(totalSales > 1 && totalSales < 99.99) {
			commission = totalSales * 5/100;
		}else if(totalSales > 100 && totalSales < 299.99) {
			commission = totalSales * 10/100;
		}else if (totalSales >= 300) {
			commission = totalSales * 15/100;
		}
		
		wage = wage + commission;
		
		System.out.println("The wage : " + wage);
		
		
		
		
	}
}
