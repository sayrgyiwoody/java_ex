package chapter_13;

interface Vehicles {
    void drive();
}

interface Car extends Vehicles {
    void hasSeat();
}

class MyCar implements Car {
    public void drive() {
        System.out.println("Driving...");
    }
    public void hasSeat() {
        System.out.println("4 seats");
    }
}


public class interface_2 {
    public static void main(String[] args) {
        MyCar car = new MyCar();
        car.drive();
        car.hasSeat();
    }
}
