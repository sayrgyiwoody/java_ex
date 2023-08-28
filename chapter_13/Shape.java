package chapter_13;

abstract class Shape {
    private String color;

    public String getColor() {
        return color;
    }

    public abstract double calculateArea();
    
}