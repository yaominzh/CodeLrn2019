package leetcode0203;
/*
203. Remove Linked List Elements

Remove all elements from a linked list of integers that have value val.

 */
public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        while (head!=null && head.val == val) {
            ListNode delNode = head;
            head = head.next;
            delNode.next = null;
        }
        if (head == null)
            return null;

        ListNode prev = head;
        while (prev.next != null) {
            if (prev.next.val == val) {
                ListNode delNode = prev.next;
                prev.next = delNode.next;
                delNode.next = null;
            } else
                prev = prev.next;
        }
        return head;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6};
        ListNode listNode=new ListNode(nums);
        System.out.println(listNode);
        System.out.println(new Solution().removeElements(listNode, 3));
    }
}
