package chapter_10;

import java.util.Scanner;

public class ex_11 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter value of N : "); 
        int N = scn.nextInt();


        double[] numbers = new double[N];
        double n;
        double sum = 0;
        for(int i = 0 ; i < N ; i++){
            System.out.println("Enter number " + (i+1) + "/" + N + " : ");
            n = scn.nextDouble();
            numbers[i] = n;
            sum += numbers[i];
        }

        double avg = sum/N;

        double[] diffSquare = new double [N];
        double totalDiffSquare = 0 ;
        for(int j = 0; j < N ; j++){
            diffSquare[j] = Math.pow((numbers[j]-avg), 2);
            totalDiffSquare += diffSquare[j];
        }

        double standardDeviation = Math.sqrt(totalDiffSquare/N);

        System.out.println("Standard Deviation for N = " + N +" : " + String.format("%.4f", standardDeviation));

    }
}
