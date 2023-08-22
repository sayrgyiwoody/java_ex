package chapter_10;

public class multiArray {
    public static void main(String[] args) {
        // int [][] twoD = new int [3][4];

        int [][] twoD = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};

        for(int i = 0; i< twoD.length ; i++){
            for(int j = 0; j< twoD[i].length ; j++){
                System.out.print(twoD[i][j] + " , ");
            }
            System.out.print("\n");
        }
    }

}
