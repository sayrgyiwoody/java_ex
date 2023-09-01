package chapter_13;

class Circle extends Shape {
    private double radius;

    public double calculateArea(){
        double area = 3.142 * radius * radius;
        return area;
    }
}
