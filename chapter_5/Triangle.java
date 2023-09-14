package chapter_5;

public class Triangle {
    public static final double INVALID_DIMENSION = -1;
    private int a;
    private int b;
    private int c;

    public Triangle(int a , int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public boolean isValid(){
        return a+b > c && b+c > a && a+c > b;
    }

    public double getPerimeter(){
        if(!isValid()) {
            return INVALID_DIMENSION;
        }
        return a+b+c;
    }

    public double getArea(){
        if(!isValid()) {
            return INVALID_DIMENSION;
        }
        double s = (a+b+c)/2;
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        return area;
    }
    
}
