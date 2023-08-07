package chapter_6;

import java.util.Formatter;

public class formatMethod {
    public static void main(String[] args) {
        Formatter formatter = new Formatter(System.out);
        int num1 = 34, num2 = 9;
        int num3 = num1 + num2;

        formatter.format("%3d + %3d = %5d", num1, num2, num3);
    }
}
