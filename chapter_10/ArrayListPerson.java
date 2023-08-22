package chapter_10;
import java.util.ArrayList;
import java.util.List;

public class ArrayListPerson {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<Person>();
        Person person;
        person = new Person("Su Su",12,'F');
        personList.add(person);

        person = new Person("Aung Aung", 13, 'M');
        personList.add(person);

        for(Person p : personList) {
            System.out.println("Name : " + p.getName() + " Age : " + p.getAge() + " Gender : " + p.getGender());
        }

    }
}
