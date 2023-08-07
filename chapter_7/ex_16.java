package chapter_7;

import myUtil.MealCard;

public class ex_16 {
    public static void main(String[] args) {
        MealCard waiyanCard = new MealCard("waiyan");
        waiyanCard.purchasePoint(150);
        waiyanCard.purchaseFood(50);

        System.out.println(waiyanCard.getName() + " " + waiyanCard.getBalance());

        MealCard woodyCard = new MealCard("woody" , 300);
        woodyCard.purchaseFood(400);

        woodyCard.purchasePoint(300);
        woodyCard.purchaseFood(500);

        System.out.println(woodyCard.getName() + " " + woodyCard.getBalance());
        
    }
}
