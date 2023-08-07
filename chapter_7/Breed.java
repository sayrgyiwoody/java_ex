package chapter_7;

public class Breed {
    private String name;
    private double averageWgt;

    public Breed (String name, double averageWgt) {
        this.name = name;
        this.averageWgt = averageWgt;
    }

    public double getWeight(){
        return averageWgt;
    }
}
