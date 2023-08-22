package chapter_10;
import java.util.*;

public class Map_eg {
    public static void main(String[] args) {
        Map<String,String> catalog;

        catalog = new TreeMap<String,String>();

        catalog.put("CS101","Intro Java Programming");
        catalog.put("CS301","Database Design");
        catalog.put("CS413", "Software Design for Mobile Devices");

        if(catalog.containsKey("CS101")) {
            System.out.println("We teach Java this semester");

        }else {
            System.out.println("No Java courses this semester");

        }

        for(Map.Entry<String,String> entry : catalog.entrySet()) {
            System.out.println(entry.getKey() + ":\t" + entry.getValue());
        }

    }
}
