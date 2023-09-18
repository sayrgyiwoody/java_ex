package practice;

public class Dog extends Pet {
    double weight;

    public Dog(String name){
        super(name,'d');
    }

    public void setWeight(double weight){
        this.weight = weight;
    }

    public double getWeight(){
        return weight;
    }
}
