package chapter_4;

import java.util.Scanner;
import java.util.Formatter;
public class CoffeeBag {
    float bagWeight;

    int numberOfBags;

    float totalPriceWithTax;
    static final float pricePerLb = 5.99f;
    static final float taxRate = 0.0725f;

    public float calculatePrice(){
        float totalPrice = 0.0f;
        totalPrice = bagWeight * numberOfBags * pricePerLb;
        totalPriceWithTax = totalPrice + (totalPrice * taxRate);
        return totalPriceWithTax;
    } 

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of Bags : ");
        CoffeeBag cof = new CoffeeBag();
        cof.numberOfBags = s.nextInt();
        System.out.println("Enteer weight of a Bag : ");
        cof.bagWeight = s.nextFloat();

        float total_price = cof.calculatePrice();


        Formatter formatter = new Formatter();
        System.out.println(formatter.format("Number of bags sold : %d %nWeight per bag : %.2f lb %nPrice per pound : $ %.2f %nSales tax : %.2f %nTotal price : $ %.2f",cof.numberOfBags,cof.bagWeight,cof.pricePerLb,cof.taxRate*100,total_price));
        
    }
}
