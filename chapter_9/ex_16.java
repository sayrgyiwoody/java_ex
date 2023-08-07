package chapter_9;

import java.util.Scanner;

public class ex_16 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a letter or blank to exit: ");
        String dna = scn.nextLine();

        while(dna.length() != 0) {

            // replacing T with A , A with T and G with C , C with G
            String compDna = dna.replace('A', '#')
            .replace('T', 'A')
            .replace('#','T')
            .replace('G', '#')
            .replace('C', 'G')
            .replace('#', 'C');

            System.out.println("Original DNA :" + dna);
            System.out.println("Complement DNA :" + compDna);

        System.out.println("Enter a letter or blank to exit: ");
        dna = scn.nextLine();
        }
    }
}
