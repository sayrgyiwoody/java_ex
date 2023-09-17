package chapter_10;

import java.util.*;

public class SearchPerson {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        Person [] person = new Person[3];

        String name ; int age ; String str ; char gender;
        for(int i = 0 ; i < person.length ; i++) {
            System.out.print("Enter person name : ");
            name = scn.next();

            System.out.print("Enter person age : ");
            age = scn.nextInt();

            System.out.print("Enter gender : ");
            str = scn.next();
            gender = str.charAt(0);

            person[i] = new Person();
            person[i].setName(name);
            person[i].setAge(age);
            person[i].setGender(gender);
        }

        // showing all objects data in array 
        // for(int i = 0 ;i< person.length ; i++){
        //     System.out.println(person[i].getName() + " " + person[i].getAge() + " " + person[i].getGender());
        // }

        scn.nextLine();
        System.out.print("\nEnter person name to search : ");
  
        String searchName = scn.nextLine();

        int index = 0;
        while(index < person.length && !person[index].getName().equals(searchName)){
            index++;
        }

        if(index == person.length) {
            System.out.println("Person name not found in array");
        }else {
            System.out.println(searchName + " found in " + index + " position of the array");
        }
    }
}