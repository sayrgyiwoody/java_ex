package Exam;

public class Payment {

    String employee_name ;
    public String getEmployee_name() {
        return employee_name;
    }

    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }

    double worked_hours ;
    public double getWorked_hours() {
        return worked_hours;
    }

    public void setWorked_hours(double worked_hours) {
        this.worked_hours = worked_hours;
    }

    double total_wage;
    static final double average_hour = 40;
    static final double hourly_wage = 8.25;
    
    public Payment(String employee_name,double worked_hours){
        this.employee_name = employee_name;
        this.worked_hours = worked_hours;
    }

    public double calculatePayment(){
        total_wage = average_hour * hourly_wage;
        if(worked_hours>average_hour) {
            total_wage += (worked_hours - average_hour) * (hourly_wage*1.5);
        }
        return total_wage;
    }

}
