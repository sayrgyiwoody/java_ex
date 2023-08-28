package chapter_13;

import java.util.ArrayList;
import java.util.Scanner;

//pet class

class Dog extends Pet {
    private double weight;

    public Dog(String name){
        super(name,'d');
    }

    public double getWeight(){
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}

class Cat extends Pet {
    private String coatColor;

    public Cat(String name) {
        super(name,'c');
    }
    public String getCoatColor() {
        return coatColor;
    }

    public void setCoatColor(String coatColor) {
        this.coatColor = coatColor;
    }
}

public class ex_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Pet> petList = new ArrayList<>();
        String name;
        char type;
        String coatColor;
        double weight;

        while(true){
            System.out.println("Enter pet name or 'STOP' to exit");
            name = scanner.next();

            if(name.equals("STOP")){
                break;
            }

            System.out.println("Enter type of pet , 'c' for cat and 'd' for dog : ");
            type = scanner.next().charAt(0);

            if(type == 'c'){
                // create new cat object 
                Cat cat = new Cat(name);
                System.out.println("Enter coat color : ");
                coatColor = scanner.next();

                //set the coat color of cat
                cat.setCoatColor(coatColor);

                //add to the arrayList
                petList.add(cat);

            }else if(type == 'd'){
                //create new dog object
                Dog dog = new Dog(name);
                System.out.println("Enter weight : ");
                weight = scanner.nextDouble();

                //set the weight of dog
                dog.setWeight(weight);

                // add to the arrayList 
                petList.add(dog);

            }else {
                System.out.println("Please enter only 'c' for cat and 'd' for dog.");
            }
        }

        //print out the arrayList
        System.out.println("\nPet List :");
        for(Pet p : petList){
            // display pet name 
            System.out.println("Pet name : " + p.getName());

            if(p.getType() == 'c') {
                //type cast to Cat object
                Cat c = (Cat) p;
                System.out.println("Type : Cat " + "\nCoat Color : " + c.getCoatColor());
            }else if(p.getType() == 'd') {
                //type cast to Dog object
                Dog d = (Dog) p;
                System.out.println("Type : Dog " + "\nWeight : " + d.getWeight());
            }
        }
    }
}
