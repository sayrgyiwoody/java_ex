package Exam;

import java.util.Formatter;

public class Student {
    String student_name;

    int student_number;

    double total_mark;

    public Student(){
        student_name = "student";
        student_number = 0;
        total_mark = 40;
    }

    public Student(String student_name,int student_number,double total_mark) {
        this.student_name = student_name;
        this.student_number = student_number;
        this.total_mark = total_mark;
    }

    String grade;

    public void displayGrade(){
        if(total_mark > 80 ) {
             grade = "A";
        }else if(total_mark > 60 ) {
             grade = "B";
        }else if(total_mark >= 40 ) {
             grade = "C";
        }else if(total_mark < 40 ) {
             grade = "D";
        }
        System.out.println("name : "+ student_name + ", number : " + student_number + ", grade : " + grade);
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.displayGrade();
        
        Student aung = new Student("Aung Aung",1,99);
        aung.displayGrade();

        Student su = new Student("Su Su",2,70);
        su.displayGrade();
    }
}
