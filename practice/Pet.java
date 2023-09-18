package practice;

public class Pet {
    String name;
    char type;

    public Pet(String name,char type){
        this.name = name;
        this.type = type;
    }

    public String getName(){
        return name;
    }

    public char getType(){
        return type;
    }
}
