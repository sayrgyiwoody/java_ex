package chapter_13;
interface Shape2 {
    String color = "red";
    void drawable();
}

class Rectangle implements Shape2 {
    public void drawable() {
        System.out.println("Draw Rectangle");
    }
}

public class interface_1 {
    
    public static void main(String[] args) {
        Rectangle rectangle= new Rectangle();
        System.out.println(rectangle.color);
        rectangle.drawable();
    }
    
}

