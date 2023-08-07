package chapter_7;

public class ex_9 {
    public static int compare(int f1, int f2){
        if(f1>f2){
            return +1;
        }else if(f1==f2){
            return 0;
        }else if(f1<f2){
            return -1;
        }
        return 2;
        //return 2 as default
    }

    public static void main(String[] args) {
        int result = ex_9.compare(10, 3);
        System.out.println(result);
    }

}
