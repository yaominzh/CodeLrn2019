package leetcode0203;

public class Solution4 {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) return null;
        head.next = removeElements(head.next, val);
        return head.val == val ? head.next : head;
    }
    public ListNode travers(ListNode head){
        if(head == null) return null;
        head.next = travers(head.next);
        System.out.println(head.val);
        return head.next;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6};
        ListNode listNode = new ListNode(nums);
        System.out.println(listNode);
        System.out.println(new Solution4().removeElements(listNode, 3));
        System.out.println(new Solution4().travers(listNode));
    }
}