package lab1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
    String name;
    int stuId;
    public int getStuId() {
        return stuId;
    }

    double totalMarks;
    Date enrolled_date;

    public Date getEnrolled_date() {
        return enrolled_date;
    }

    Student(String name,int stuId,double totalMarks) {
        this.name = name;
        if (stuId >= 1 && stuId <= 37) {
            this.stuId = stuId;
        } else {
            throw new IllegalArgumentException("Student ID must be between 1 and 37.");
        }
        this.totalMarks = totalMarks;
        this.enrolled_date = new Date();
        
    }

    public void displayInfo(){
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");  
        String format_enrolled_date = formatter.format(enrolled_date);
        System.out.println("Name : " + name + "\n" +
        "ID : " + stuId + "\n" +
        "Total Marks : " + totalMarks + "\n" +
        "Enrolled Date : " + format_enrolled_date);
    }
    
}
