package w02;

/**
 * Created by AZ 2020-05-06
 */

public class TwoSort {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        if (b < a) {
            System.out.println("do two sort");
            int t = a;
            a=b;
            b=t;
        }
        System.out.println(a);
        System.out.println(b);
    }
}
