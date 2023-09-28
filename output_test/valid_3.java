package output_test;

public class valid_3 {
    public static void main(String[] args) {
        int i = 1,j = 2;
        float x = 3.3f, y = 4.4f;
        double u = 3.3 , v = 4.4;

        i = x;
        x = u + y;
        x = 23.4 + j * y;   
        v = (int) x;
        y = j/i *x;
    }
}
