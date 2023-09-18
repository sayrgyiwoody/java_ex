package chapter_13;

class Animal {
    public void eat(){
        System.out.println("Animals Eat");
    }    
}

class Cows extends Animal {
    public void eat() {
        System.out.println("Cows eat plants");
    }
    public static void main(String[] args) {
        Cows cow = new Cows();
        cow.eat();
    }
}