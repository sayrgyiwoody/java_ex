package chapter_10;
import java.util.*;

public class TestAddressBook {
    AddressBook myBook;
    Person person;

    public void setupArray(int N){
        myBook = new AddressBook(N);
        
        //add N Person objects
        for(int i = 0 ;i < N ; i++) {
            person = new Person("Ms. X" + i , 10 , 'F');
            myBook.add(person);
        }

    }

    public void testSearch() {
        //test for the end case
        // person = myBook.searchName("Ms. X2");
        
        //test for exercise 15
        // person = myBook.searchAge(10);
        person = myBook.searchGender('M');

        if(person == null) {
            System.out.println("Error Didn't find the person it should");
        }else {
            System.out.println(person.getName() + " is found okay.");
        }
    }

    // test exercise 14 
    public void testMultipleSearch(){
        AddressBook addressBook = new AddressBook(5);

        // Add some persons to the address book
        addressBook.add(new Person("Alice"));
        addressBook.add(new Person("Bob"));
        addressBook.add(new Person("Alice"));
        addressBook.add(new Person("Charlie"));
        addressBook.add(new Person("Alice"));

        ArrayList<Person> personList = addressBook.searchMultiple("Alice");

        if(personList == null){
            System.out.println("No person found");
        }else {
            for(Person person : personList) {
                System.out.print(person.getName() + " , ");
            }
        }
    }

    public static void main(String[] args) {
        TestAddressBook tester = new TestAddressBook();
        tester.setupArray(5);
        tester.testSearch();
        tester.testMultipleSearch();
    }


}
