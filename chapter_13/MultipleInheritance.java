package chapter_13;

interface Additions {
    void sum (int num1, int num2);
}

interface Subtraction {
    void sub (int num1, int num2);
}

public class MultipleInheritance implements Additions,Subtraction {
    public void sum(int num1, int num2){
        System.out.println("Addition is " + (num1 + num2));
    }
    public void sub(int num1, int num2) {
        System.out.println("Subtraction is " + (num1 - num2));
    }

    public static void main(String[] args) {
        MultipleInheritance obj = new MultipleInheritance();
        obj.sum(5,2);
        obj.sub(5, 2);
    }
}
