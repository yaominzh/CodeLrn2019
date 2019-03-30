package chap02Array;

public class Test {
    public static void main(String[] args) {
        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++)
            arr[i] = i;
        for (int i: arr){
            System.out.println(i);
        }
    }
}
