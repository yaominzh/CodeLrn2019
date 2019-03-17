import java.util.ArrayList;

public class MoveZeros2 {
    public void moveZeroes(int[] nums) {
        int pIndex = 0;
        for(int i:nums){
            if(i!=0){
                nums[pIndex++] = i;
            }
        }
        for(int i=pIndex;i<nums.length;i++){
            nums[i]=0;
        }
    }

    public static void main(String[] args) {

        int[] list = {1, 2, 0, 0, 12};
        (new MoveZeros2()).moveZeroes(list);
        for (int i:list){
            System.out.println(i);
        }

    }
}
