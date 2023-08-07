package chapter_6;

import java.util.Formatter;

public class control_string {
    public static void main(String[] args) {
        Formatter formatter = new Formatter(System.out);
        formatter.format("%15.3f", 345.9867);
        // %15 = 15 characters && .3 = 3 digits (f = float)

        System.out.println("");
        String name = "John";

        formatter.format("Hello , %s. Nice to meet you.",name);

    }
}
