package chapter_10;
import java.util.ArrayList;
import java.util.List;

public class collection_eg1 {
    public static void main(String [] args) {
        List<String> fruits = new ArrayList<String>();
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("banana");

        for(String f : fruits) {
            System.out.println(f);
        }

        ArrayList<Integer> num = new ArrayList<Integer>();
        num.add(1);
        num.add(2);
        num.add(3);

        for (Integer i : num) {
            System.out.println(i);
        }
    }    
}
