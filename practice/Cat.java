package practice;

public class Cat extends Pet {
    String coatColor;

    public Cat(String name){
        super(name,'c');
    }

    public void setCoatColor(String coatColor){
        this.coatColor = coatColor;
    }

    public String getCoatColor(){
        return this.coatColor;
    }
}
