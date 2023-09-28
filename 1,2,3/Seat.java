package java_1;

public class Seat {
	public int ticketNum ;
	public int ticketPrice ;
	public Seat(int x , int y){
		this.ticketNum = x;
		this.ticketPrice = y;
	}
	
	public int getTicketNum() {
		return this.ticketNum;
	}
	
	public int getTicketPrice() {
		return this.ticketPrice;
	}
}
