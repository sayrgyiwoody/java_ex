package output_test;

import java.util.*;

public class exception_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
        int num = scanner.nextInt();
        if (num != 0) {
        throw new ArithmeticException("Not zero");
        }
        System.out.println("I'm happy with the input.");
        } catch (InputMismatchException e) {
        System.out.println("Invalid Entry");
        } catch (ArithmeticException e) {
        System.out.println("Error: "+ e.getMessage());
        }
    }
}
