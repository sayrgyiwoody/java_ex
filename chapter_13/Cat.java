package chapter_13;

public class Cat extends Pet {
    private String coatColor;

    public Cat(String name) {
        super(name,'c');
    }
    public String getCoatColor() {
        return coatColor;
    }

    public void setCoatColor(String coatColor) {
        this.coatColor = coatColor;
    }
}
