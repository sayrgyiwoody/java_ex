package chapter_10;

import java.util.ArrayList;

public class AddressBook {
    private static final int DEFAULT_SIZE = 25;
    private Person[] entry;
    private int count;

    public AddressBook(){   
        this(DEFAULT_SIZE);
    }


    public void expand(){
        //create a new array whose size is 150% of the current array
        int newLength = (int) (1.5 * entry.length);
        Person[] temp = new Person[newLength];

        //copy the data to the new array 

        for(int i = 0 ; i < entry.length ; i++) {
            temp[i] = entry[i];
        }

        //set the variable entry to point to the new array
        entry = temp;

        System.out.println("Inside the method enlarge."); //TEMP

        System.out.println("Size of a new array : " + entry.length);
    
    }   

    public void add (Person newPerson) {
        assert count >= 0 && 
        count <= entry.length;

        if(count == entry.length) {
            expand();
        }

        entry[count] = newPerson;
        count++;
    }

    public AddressBook(int size){
        count = 0;
        if(size <= 0) {
            throw new IllegalArgumentException("Size must be positive.");
        }
        entry = new Person[size];

        System.out.println("Array of " + size + " is created.");

    }

    public Person searchName (String searchName) {
        Person foundPerson;
        int loc = 0 ;
         
        assert count >= 0 && count<= entry.length;

        while(loc < count && !searchName.equals(entry[loc].getName())) {
            loc++;
        };

        if(loc == count) {
            foundPerson = null;
        }else {
            foundPerson = entry[loc];
        }

        return foundPerson;
    }

    public Person searchAge (int searchAge) {
        Person foundPerson;
        int loc = 0 ;
         
        assert count >= 0 && count<= entry.length;

        while(loc < count && searchAge != entry[loc].getAge()) {
            loc++;
        };

        if(loc == count) {
            foundPerson = null;
        }else {
            foundPerson = entry[loc];
        }

        return foundPerson;
    }

    public Person searchGender (char searchGender) {
        Person foundPerson;
        int loc = 0 ;
         
        assert count >= 0 && count<= entry.length;

        while(loc < count && searchGender != entry[loc].getGender()) {
            loc++;
        };

        if(loc == count) {
            foundPerson = null;
        }else {
            foundPerson = entry[loc];
        }

        return foundPerson;
    }

    // exercise 14
    public ArrayList<Person> searchMultiple(String searchName) {
        ArrayList<Person> foundPerson = new ArrayList<Person>();

        assert count >= 0 && count < entry.length;

        for (int i = 0 ; i< entry.length ; i++) {
            if(searchName.equals(entry[i].getName())) {
                 foundPerson.add(entry[i]);
            }
        }
        
        return foundPerson;
    }

    
}
