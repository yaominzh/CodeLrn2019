package leetcode0203;

public class Solution3 {
    public ListNode removeElements(ListNode head, int val) {
        if(head == null) return null;
        ListNode res = removeElements(head.next, val);
        if(head.val ==val)
            return res;
        else{
            head.next = res;
            return head;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6};
        ListNode listNode=new ListNode(nums);
        System.out.println(listNode);
        System.out.println(new Solution3().removeElements(listNode, 3));
    }
}
