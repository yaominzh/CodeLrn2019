import java.util.ArrayList;

public class MoveZeros {
    public static void main(String[] args) {

        int[] list = new int[]{1, 2, 0, 0, 12};
        ArrayList newList = new ArrayList();
        int nonZero = 0;


        for (int i : list) {
            if (i > 0) {
                newList.add(i);
                nonZero++;
            }
        }
        for (int i = nonZero; i < list.length; i++) {
            newList.add(0);
        }
        System.out.println(newList);
    }
}
