package Exam;

public class Holiday {
    String name;
    int day;
    String month;

    public Holiday(String name,int day,String month){
        this.name = name;
        this.day = day;
        this.month = month;
    }

    public boolean inSameMonth(Holiday h2){
        if(this.month.equals(h2.month)){
            return true;
        }
        return false;
    }

    public double avgDay(Holiday h1,Holiday h2){
        double avg = (h1.day + h2.day )/2;
        return avg;
    }

    public static void main(String[] args) {
        Holiday h1 = new Holiday("Martyr Day", 19, "July");

        Holiday h2 = new Holiday("FullMoon Warso Day", 1, "August");

        boolean isSameMonth = h1.inSameMonth(h2);
        System.out.println(isSameMonth);
        double avgDay = h1.avgDay(h1, h2);
        System.out.println(avgDay);


    }

}

