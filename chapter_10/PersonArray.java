package chapter_10;

import java.util.Scanner;

public class PersonArray {
    public static void main(String[] args) {
        Person person[] = new Person[3];
        Scanner scanner = new Scanner(System.in);

        String name; int age; char gender ; String str;
        for (int i = 0 ; i < person.length ; i++) {
            System.out.print("Enter name : ");
            name = scanner.next();

            System.out.print("Enter age : ");
            age = scanner.nextInt();

            System.out.print("Enter gender : ");
            str = scanner.next();
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

        // Finding youngest and oldest age person 
        Person youngest = person[0];
        Person oldest = person[0];

        for(int i = 0; i < person.length ; i++){
            if(person[i].getAge() < youngest.getAge()){
                youngest = person[i];
            }else if (person[i].getAge() > oldest.getAge()){
                oldest = person[i];
            }
        }

        //showing youngest and oldest object's datas

        System.out.println("Youngest Person Name = " + youngest.getName() + "\nAge : " + youngest.getAge() );
        System.out.println("Oldest Person Name = " + oldest.getName() + "\nAge : " + oldest.getAge() );

    }
}
