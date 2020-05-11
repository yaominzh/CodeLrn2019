package w02;

/**
 * Created by AZ 2020-05-06
 */

public class PowerOfTwo {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int i = 0;
        int v = 1;
        while (i <= n) {
            System.out.println(v);
            i = i+1;
            v = 2*v;
        }
    }

}
