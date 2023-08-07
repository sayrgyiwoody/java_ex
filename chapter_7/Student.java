package chapter_7;

public class Student {
    int rollNo;
    String name;

    Student(){
        this(100,"Aye Aye");
        System.out.println("CAlling from default constructor");

    }

    Student (int rollNo) {
        this.rollNo = rollNo;
    }

    Student (String name) {
        this.name = name;
    }

    Student (int rollNo,String name) {
        this.rollNo = rollNo;
        this.name = name;
    }
}


