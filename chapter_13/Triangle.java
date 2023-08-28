package chapter_13;

class Triangle extends Shape{
    private double base , height;

    public double calculateArea(){
        double area = (base * height) / 2 ;
        return area;
    }
}
