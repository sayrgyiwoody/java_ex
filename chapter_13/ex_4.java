package chapter_13;

import java.util.ArrayList;
import java.util.Scanner;

//pet class

public class ex_4 {
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
                Cat cat = new Cat(name);
                petList.add(cat);
            } else if(type == 'd'){
                Dog dog = new Dog(name); 
                petList.add(dog);
            } else{
                System.out.println("Invalid type. Please enter 'c' for cat or 'd' for dog.");
            }
        }

        System.out.println("List of Pets:");
        
        for (Pet p : petList) {
            String petType = (p.getType() == 'c') ? "Cat" : "Dog";
            System.out.println("Name: " + p.getName() + ", Type: " + petType);
        }

        
    }
}
