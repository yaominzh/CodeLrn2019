package w02;

/**
 * Created by AZ 2020-05-06
 */

public class Factors {
    public static void main(String[] args) {
        long n = Long.parseLong(args[0]);
        System.out.println(n);
        for (int i = 2; i < n; i++) {
            while(n % i ==0) {
                System.out.println(i + " ");
                n = n/i;
            }
        }
        int a=0 ,b=0,c=0;
        String sa = "aa";
        String sb = "bb";
    }

}
