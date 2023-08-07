package chapter_6;

import java.util.Formatter;

public class formatter {
    public static void main(String[] args) {
        Formatter formatter = new Formatter(System.out);

        int num = 467;
        formatter.format("%6d", num);
        }


}
