package Exam;

public class Movie {
    String title;
    String studio;
    String rating;

    public Movie(String title , String studio, String rating){
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }
    
    public Movie(String title,String studio){
        this.title = title;
        this.studio = studio;
        this.rating = "PG";
    }

    public void getRating (Movie m1,Movie m2,Movie m3){
        if(m1.rating.equals("PG")){
            System.out.println("Movie name : " + m1.title + ", Studio : " + m1.studio + ",Rating : " + m1.rating );
        }else if(m2.rating.equals("PG")){
            System.out.println("Movie name : " + m2.title + ", Studio : " + m2.studio + ",Rating : " + m2.rating );
        }else if(m2.rating.equals("PG")){
            System.out.println("Movie name : " + m3.title + ", Studio : " + m3.studio + ",Rating : " + m3.rating );
        }
    }

    public static void main(String[] args) {
        Movie m1 = new Movie("The Little Mermaid",  "Walt Disney");
        Movie m2 = new Movie("John Wick 4", "Summit Entertainment","R");
        Movie m3 = new Movie("Guardians of the Galaxy Vol. 3", "Marvels","PG-13");

        m1.getRating(m1, m2, m3);
    }
}
