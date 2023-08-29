package chapter_13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//pet class

public class ex_5 {
    public static void main(String[] args) {
        ArrayList<Pet> petList = new ArrayList<>();
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
                Pet pet = new Pet(name,'c');
                petList.add(pet);
            } else if(type == 'd'){
                Pet pet = new Pet(name,'d');
                petList.add(pet);
            } else{
                System.out.println("Invalid type. Please enter 'c' for cat or 'd' for dog.");
            }
        }

        Collections.sort(petList,(o1,o2) -> o1.getType() - o2.getType());
        System.out.println("\nList of Pets:");

        for (Pet p : petList) {
            System.out.println( "Name: " + p.getName() + " Type : " + p.getType() );
        }

        
    }
}
