package chapter_7;

public class ex_10 {
    public int compare(int f1, int f2){
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
        ex_10 ex10 = new ex_10();
        int result = ex10.compare(10, 20);
        System.out.println(result);
    }

}
