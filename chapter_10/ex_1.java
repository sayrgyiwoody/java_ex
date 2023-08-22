package chapter_10;

public class ex_1 {
        public static int[] searchAccount(int[] number){
            number = new int[15];
            
            for(int i = 0 ; i< number.length ; i++){
                number[i] = number[i-1] + number[i+1];
            }

            return number;

        }
}
