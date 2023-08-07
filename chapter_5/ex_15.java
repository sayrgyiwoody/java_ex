package chaper_5;

public class ex_15 {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(3,4,5);
        double area = triangle.getArea();
        double perimeter = triangle.getPerimeter();
        
        if(perimeter == Triangle.INVALID_DIMENSION){
            System.out.println("Invalid Triangle Dimensions");
        }else {
            System.out.println("Perimeter of the triangle : " + perimeter);
        }

        if(area == Triangle.INVALID_DIMENSION) {
            System.out.println("Invalid Triangle Dimensions");
        }else{
            System.out.println("Area of the triangle : " + area);
        }
    }

}
