package chapter_5;
import java.util.*; 

public class ex_11 {

	public static void main(String[] args) {
		
		int weight ,height, recommendWeight ;
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter your height in cm : ");
		height = scn.nextInt();
		System.out.println("Enter your weight in lb : ");
		weight = scn.nextInt();
		
		if(height > 140 & height < 230) {
			recommendWeight =  height - 110;
			int maxWeight = 10+recommendWeight;
			int minWeight = recommendWeight - 20;
			
			if(weight > maxWeight) {
				System.out.println("You should exercise more");
			}else if(weight < minWeight) {
				System.out.println("You need more nourishment");
			}
		}
		
		
		
	}

}
