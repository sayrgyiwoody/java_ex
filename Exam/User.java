package Exam;


abstract class Shape {
    private String color;

    public void setColor(String color){
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract void computeArea();
    
}

class Triangle extends Shape{
    private double base , height;

    public Triangle(String color, double base, double height) {
        this.setColor(color);
        this.base = base;
        this.height = height;
    }

    public void computeArea(){
        double area = (base * height) / 2 ;
        System.out.println("Area of triangle " + this.getColor() + " : " + area);
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius){
        this.setColor(color);
        this.radius = radius;
    }

    public void computeArea(){
        double area = 3.142 * radius * radius;
        System.out.println("Area of Circle " + this.getColor() + " : " + area);
    }
}

public class User {
    public static void main(String[] args) {
        Shape circle = new Circle("red",2);
        Shape triangle = new Triangle("black", 4, 2);

        circle.computeArea();
        triangle.computeArea();
    }

}
