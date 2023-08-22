package chapter_10;

public class PayScaleTable {
    public static void main(String[] args) {
        
        double payScale[][] = {
            { 10.50, 12.00, 14.50, 16.75, 18.00 },
            { 20.50, 22.25, 24.00, 26.25, 28.00 }, 
 	        { 34.00, 36.50, 38.00, 40.35, 43.00 },
 	        { 50.00, 60.00, 70.00, 80.00, 99.99 } 
        };

        double averageGrade[] = new double[4];
        

        for (int i = 0 ; i< payScale.length; i++) {
             
            for (int j = 0 ; j < payScale[i].length ; j++) {
                averageGrade[i] += payScale[i][j];
            }
            averageGrade[i] /= payScale[i].length;
        }

       

        for(int i = 0 ;i < averageGrade.length ; i++) {
            System.out.println("Average of Grade Level " + i + " Employees : " + averageGrade[i]);
        }

        

    }
    
}
