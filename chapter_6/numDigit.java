package chapter_6;

public class numDigit {
    private static int num;

    public numDigit(int num ) {
        this.num = num;
    }

    //method to return number of digits
    public static int getDigit() {
        String strNum = Integer.toString(num);
        int numOfDigit = strNum.length();
        return numOfDigit;
    }
}
