package Exam;

import java.util.Formatter;
import java.util.Scanner;

public class EmployeePayment {
    public static void main(String[] args) {
        Formatter formatter = new Formatter(System.out);
        Payment payment = new Payment("Wai Yan Tun",50);
        double total_wage = payment.calculatePayment();
        // System.out.println(total_wage);
        formatter.format("Name :  %10s %nWork Hours %.2f %nTotal Wage : %.2f",payment.getEmployee_name(),payment.getWorked_hours() , total_wage);
    }
}
