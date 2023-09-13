package lab1;

import java.util.Date;

public class User {
    public static void main(String[] args) {
        SectionA secA = new SectionA();
        Student stu1 = new Student("mg mg", 1, 60);
        Student stu2 = new Student("aung aung" ,2 , 40);
        Student stu3 = new Student("hla hla",3,70);

        secA.addStudent(stu1, stu1.stuId);
        secA.addStudent(stu2, stu2.stuId);
        secA.addStudent(stu3, stu3.stuId);

        Student studentToRemove = new Student("David", 4, 82.5);
        secA.addStudent(studentToRemove, studentToRemove.getStuId());

        secA.removeStudent(studentToRemove, studentToRemove.getStuId());
        secA.displayStudentInfo(4);

        Date enrollmentDate = stu1.getEnrolled_date();
        secA.checkDateDifference(enrollmentDate);

    }
}
