package chapter_13;

public class Dog extends Pet{
    private double weight;

    public Dog(String name){
        super(name,'d');
    }

    public double getWeight(){
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
