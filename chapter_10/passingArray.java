package chapter_10;

public class passingArray {

    static int searchMinimum(int [] numArray) {
        int min = numArray[0];

        for (int i = 0 ; i< numArray.length ; i++ ) {
            if(numArray[i]<min) {
                min = numArray[i];
            }
        }

        return min;
    }
    public static void main(String[] args) {
        int num[] = {4,5,6,7,10,2};
        int result = searchMinimum(num);

        System.out.println("Minimum number : " + result );
    }
}
