package chapter_10;

public class ex_13 {
    public static void main(String[] args) {
        double payScale[][] = {
            { 10.50, 12.00, 14.50, 16.75, 18.00 },
            { 20.50, 22.25, 24.00, 26.25, 28.00 }, 
 	        { 34.00, 36.50, 38.00, 40.35, 43.00 },
 	        { 50.00, 60.00, 70.00, 80.00, 99.99 } 
        };

        double averageGrade[] = new double[4];
        double averageStep[] = new double[5];

        double rowSum;
        double columnSum;

        for (int i = 0 ; i < payScale.length ; i++) {
            rowSum = 0;
            for(int j = 0 ; j < payScale[i].length ; j++){
                rowSum += payScale[i][j];
            }
            averageGrade[i] = rowSum/payScale[i].length;
        }

        for (int j = 0; j < payScale[0].length; j++) {
            columnSum = 0;
            for (int i = 0; i < payScale.length; i++) {
                columnSum += payScale[i][j];
            }
            averageStep[j] = columnSum / payScale.length;
        }

        for ( int i = 0; i < averageGrade.length; i++) {
            System.out.println("Average pay for grade " + (i+1) + " : " + averageGrade[i]);
        }

        for(int i = 0 ;i < averageStep.length ; i++) {
            System.out.println("Average pay for Step " + (i+1) + " Employees : " + averageStep[i]);
        }

    }
}
