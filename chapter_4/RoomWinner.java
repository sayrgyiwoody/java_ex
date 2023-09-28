package chapter_4;


public class RoomWinner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LotteryCard one , two , three;
		
		one = new LotteryCard();
		two = new LotteryCard();
		three = new LotteryCard();
		
		
		one.spin();
		two.spin();
		three.spin();
		
		System.out.println("Winning Card Combination : ");
		System.out.println("1 - red; 2 - green; 3 - blue");
		System.out.println(" ");
		
		System.out.println("        \tcolor\tnumber ");
		
		System.out.println("Card 1 : \t" + one.getColor() + "\t" + one.getNumber());
		System.out.println("Card 2 : \t" + two.getColor() + "\t" + two.getNumber());	
		System.out.println("Card 3 : \t" + three.getColor() + "\t" + three.getNumber());
	}

}
