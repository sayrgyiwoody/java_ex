package myUtil;

public class MealCard {
    private String studentName;
    private  int balance;

    public MealCard(String studentName){
        this.studentName = studentName;
        this.balance = 100;
    }

    public MealCard(String studentName,int balance) {
        this.studentName = studentName;
        this.balance = balance;
    }

    public void purchasePoint(int point) {
        if(point > 0) {
            this.balance += point;
            System.out.println(point + " points are added to balance");
        }else {
            System.out.println("Invalid point number");
        }
    }

    public void purchaseFood(int foodPoint) {
        if(this.balance>0) {
            if(this.balance >= foodPoint) {
                balance -= foodPoint;
            System.out.println("Food purchased successfully and " + foodPoint 
            + " are deducted from balance.");
            }else {
                System.out.println("Your balance is insufficient to buy food" 
                + ", Your balance : " + this.balance + " Food Point : " + foodPoint);
            }
        }else {
            System.out.println("Balance can't be negative");
        }
    }

    public String getName(){
        return this.studentName;
    }

    public int getBalance(){
        return this.balance;
    }

    
    
}
