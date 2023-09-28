package java_1;

public class Circle {
	private double r;
	private double A;
	
	public Circle(double radius){
		this.r = radius;
	}
	
	public double getArea(){
		this.A = 3.142 * this.r * this.r;
		return this.A;
	}
	
	public double getCircumference(){
		return 2 * 3.142 * this.r;
	}
	
	public static void main(String [] args){
		Circle inner_circle = new Circle(2);
		Circle outer_circle = new Circle(4);
		
		double region_area = outer_circle.getArea() - inner_circle.getArea() ;
		
		System.out.println(region_area);
	}
}
