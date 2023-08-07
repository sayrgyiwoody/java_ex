package chapter_7;

import myUtil.MealCard;

public class ex_15 {
    public static void main(String[] args) {
        MealCard waiyanCard = new MealCard("Wai Yan Tun");

        waiyanCard.purchaseFood(100);

        System.out.println(waiyanCard.getName() + " " + waiyanCard.getBalance());

        waiyanCard.purchasePoint(150);

        System.out.println(waiyanCard.getName() + " " + waiyanCard.getBalance());

    }
}
