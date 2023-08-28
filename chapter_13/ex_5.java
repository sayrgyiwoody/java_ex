package chapter_13;

import java.util.ArrayList;
import java.util.Scanner;

//pet class

public class ex_5 {
    public static void main(String[] args) {
        ArrayList<Pet> cat = new ArrayList<>();
        ArrayList<Pet> dog = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("Enter the name of the pet (or 'STOP' to quit): ");
            String name = scanner.nextLine();

            if (name.equals("STOP")) {
                break;
            }

            System.out.print("Enter the type of the pet ('c' for cat, 'd' for dog): ");
            char type = scanner.nextLine().charAt(0);

            if (type == 'c') {
                Pet pet = new Pet(name, type);
                cat.add(pet);
            } else if(type == 'd'){
                Pet pet = new Pet(name,type);
                dog.add(pet);
            } else{
                System.out.println("Invalid type. Please enter 'c' for cat or 'd' for dog.");
            }
        }

        System.out.println("\nList of Cats:");
        for (Pet p : cat) {
            System.out.println( "Name: " + p.getName() );
        }

        System.out.println("\nList of Dogs:");
        for (Pet p : dog) {
            System.out.println( "Name: " + p.getName() );
        }
    }
}
