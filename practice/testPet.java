package practice;

import java.util.*;

public class testPet {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String name,str;
        char type;

        ArrayList<Pet> petList = new ArrayList<>();

        while(true){
            System.out.println("Enter pet name or STOP to exit : ");
            name = scn.next();

            if(name.equals("STOP")){
                break;
            }

            System.out.println("Enter type of pet ('c' for cat and 'd' for dog) : ");
            str = scn.next();
            type = str.charAt(0);

            if(type == 'c'){
                Cat cat = new Cat(name);
                System.out.println("Enter coat color for cat : ");
                String coatColor = scn.next();
                cat.setCoatColor(coatColor);
                petList.add(cat);
            }else if(type == 'd'){
                Dog dog = new Dog(name);
                System.out.println("Enter weight of dog : ");
                double weight = scn.nextDouble();
                dog.setWeight(weight);
                petList.add(dog);
            }else {
                System.out.println("Invalid type of pet try again : ");
            }
        }

        System.out.println("List of pets:\n");

        Collections.sort(petList,(o1,o2)-> o1.getType() - o2.getType());

        for(Pet p : petList){
            System.out.println("Pet name : " + p.getName() + " , Pet type : " + p.getType());
            if(p.getType() == 'c'){
                Cat c = (Cat) p;
                System.out.println("Coat color : " + c.getCoatColor());
                
            }else if(p.getType() == 'd'){
                Dog d = (Dog) p;
                System.out.println("Coat color : " + d.getWeight());
            }
        }



    }
}
