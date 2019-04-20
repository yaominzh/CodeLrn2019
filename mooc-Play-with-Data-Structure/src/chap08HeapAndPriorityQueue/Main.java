package chap08HeapAndPriorityQueue;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int n = 1000000;
//        int n = 10;

        MaxHeap<Integer> maxHeap = new MaxHeap<>();
        Random random = new Random();
        for(int i = 0 ; i < n ; i ++) {
            System.out.println(i);
            maxHeap.add(random.nextInt(Integer.MAX_VALUE));
        }

        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i ++) {
            System.out.println("to arr :" + i);
            arr[i] = maxHeap.extractMax();
        }

        for(int i = 1 ; i < n ; i ++)
            if(arr[i-1] < arr[i])
                throw new IllegalArgumentException("Error");

        System.out.println("Test MaxHeap completed.");
    }
}

