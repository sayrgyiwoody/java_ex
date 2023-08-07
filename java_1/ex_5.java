package java_1;

public class ex_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Die one = new Die();
		for(int i =0;i < 3; i++) {
			one.roll();
			System.out.println(one.getNumber());
		}
	}

}
