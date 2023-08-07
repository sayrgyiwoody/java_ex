package chapter_7;

public class ex_1 {
    public static void main(String[] args) {
        Breed persian = new Breed("Persian",10.0);

        Breed chacha = new Breed("Cha Cha", 12.0);

        Cat bombom = new Cat("Bom Bom", persian, 10.0);

        Cat puffpuff = new Cat("Puff Puff", chacha , 9.0);

        double diff = chacha.getWeight() - persian.getWeight();

        // System.out.println(diff);
        System.out.println(puffpuff.getBreed().getWeight());
    }
}
