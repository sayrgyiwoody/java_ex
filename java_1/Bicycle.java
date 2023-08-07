package java_1;
import java.util.Scanner;

public class Bicycle {
	private String brand;
	private Student owner;
	
	public Bicycle (String brand,Student owner){
		this.brand = brand;
		this.owner = owner;
			
	}
	
	public Student getOwner(){
		return owner;
	}
	
	public String getBrand(){
		return brand;
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Student Name : ");
		String student_name = scn.next();
		System.out.println("Enter Bicycle Brand Name : ");
		String bicycle_brand = scn.next();
		Student student = new Student(student_name);
		Bicycle bicycle = new Bicycle(bicycle_brand,student);
		
		System.out.println(student.getName());
		System.out.println(bicycle.getBrand()+ " " + bicycle.getOwner().getName());
	}	
	
	
}
