package lab1;

import java.util.ArrayList;
import java.util.Date;

public class SectionA {
    
    private Student[] students;
    private static final int totalStudents = 37;

    public SectionA() {
        students = new Student[totalStudents];
    }

    public SectionA(Student student) {
        this();
        addStudent(student, student.stuId);
    }

    int currentIndex = 0;
    public void addStudent(Student stu , int stuId) {
        if (stuId >= 1 && stuId <= totalStudents && students[stuId - 1] == null) {
            students[stuId - 1] = stu;
            System.out.println("Student added to SectionA.");
        } else {
            System.out.println("Invalid student ID or student already exists.");
        }
    }

    public void removeStudent(Student stu, int stuId) {
        if (stuId >= 1 && stuId <= totalStudents && students[stuId - 1] != null) {
            students[stuId - 1] = null;
            System.out.println("Student removed from SectionA.");
        } else {
            System.out.println("Invalid student ID or student not found.");
        }
    }

    public void displayStudentInfo(int stuId){
        if (stuId >= 1 && stuId <= totalStudents && students[stuId - 1] != null) {
            students[stuId - 1].displayInfo();
        } else {
            System.out.println("Invalid student ID or student not found.");
        }
    }

    public void checkDateDifference(Date enrolled_day){
        Date currentDate = new Date();
        long diff = currentDate.getTime() - enrolled_day.getTime();
        long daysSinceEnrolled = diff / (24 * 60 * 60 * 1000);
        System.out.println("Days since enrolled: " + daysSinceEnrolled);
    }
}
