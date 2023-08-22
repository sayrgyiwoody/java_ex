package chapter_10;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class ex_12 {
    public static void main(String[] args) {
        List<Double> numbers = new ArrayList<Double>();
        int N ;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter value of N : ");
        N = scn.nextInt();

        double n , sum = 0, avg;

        for(int i= 0 ; i < N ; i++){
            System.out.println("Enter number " + (i+1) + "/" + N + " : ");
            n = scn.nextDouble();
            numbers.add(n);
            sum += n;
        }

        // for (Double s : numbers) {
        //     sum += s;
        // }

        avg = sum/N;


        List<Double> diffSquare = new ArrayList<Double>();

        for(double s : numbers){
            diffSquare.add(Math.pow((s-avg), 2));
        }

        double totalDiffSquare = 0;
        for(double d : diffSquare){
            totalDiffSquare += d;
        }

        double standardDeviation = Math.sqrt(totalDiffSquare/N);

        System.out.println("Standard Deviation : " + String.format("%.4f", standardDeviation));

    }
}
