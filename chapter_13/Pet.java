package chapter_13;

public class Pet {
    private String name;
    private char type;

    public Pet(String name, char type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public char getType() {
        return type;
    }
}
