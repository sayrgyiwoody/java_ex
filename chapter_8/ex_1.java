package chapter_8;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ex_1 {
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
