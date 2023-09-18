package chapter_13;

import java.util.*;

abstract class Student {
    public static final int num_of_tests = 3;
    protected String name;
    protected int[] test = new int[num_of_tests]; 
    protected String courseGrade;

    public Student(){
        this.name = "woody";
    }

    public Student(String name){
        this.name = name;
    }

    public String getCourseGrade(){
        return courseGrade;
    }

    public String getName(){
        return name;
    }

    public int getTestScore(int i){
        return test[i];
    }

    public void setName(String name){
        this.name = name;
    }

    public void setTestScore(int i, int score){
        test[i] = score;
    }

    public abstract String computeCourseGrade();
}

class UndergraduateStudent extends Student {
    private int total = 0;
    public String computeCourseGrade(){
        for(int i = 0 ; i < num_of_tests ; i++){
            total += test[i];
        }

        if(total/3 >= 70) {
            courseGrade = "pass";
        }else {
            courseGrade = "fail";
        }

        return courseGrade;
    }
}

class GraduateStudent extends Student {
    private int total = 0;

    public String computeCourseGrade(){
        for(int i = 0 ; i < num_of_tests ; i++){
            total += test[i];
        }

        if(total/3 >= 80) {
            courseGrade = "pass";
        }else {
            courseGrade = "fail";
        }

        return courseGrade;
    }
}

public class StudentGraduate {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Type of student : Undergraduate (U) or Graduate (G) : ");
        char type = scn.next().charAt(0);

        System.out.print("Enter your name : ");
        String name = scn.next();

        if(type == 'U'){
            Student u_stud = new UndergraduateStudent();
            for(int i = 0 ; i < u_stud.num_of_tests ; i++){
                System.out.print("Enter score for subject " + (i+1) + " : ");
                u_stud.setTestScore(i,scn.nextInt());
            }
            System.out.println("Student name : " + u_stud.getName() + "\nCourse Grade : " + u_stud.computeCourseGrade());
        }else if (type == 'G'){
            Student g_stud = new GraduateStudent();
            for(int i = 0 ; i< g_stud.num_of_tests ; i++){
                System.out.print("Enter score for subject " + (i+1) + " : ");
                g_stud.setTestScore(i, scn.nextInt());
            }
            System.out.println("Student name : " + g_stud.getName() + "\nCourse Grade : " + g_stud.computeCourseGrade());
        }else {
            System.out.println("Invalid input enter only G or U");
        }

        
    }
}