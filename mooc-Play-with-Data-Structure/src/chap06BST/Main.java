package chap06BST;

public class Main {
    public static void main(String[] args) {
        BST<Integer> bst = new BST<>();
        int[] nums = {5,3,6,8,4,2};
        for(int num: nums)
            bst.add(num);
        bst.preOrder();
        System.out.println();
        System.out.println();
        System.out.println();
        bst.levelOrder();
//
//        System.out.println(bst);
//        bst.postOrder();
//        System.out.println();
//        System.out.println();
//        System.out.println();
//        bst.inOrder();
//        System.out.println();
//        System.out.println();
//        bst.preOrderNR();
    }
}
