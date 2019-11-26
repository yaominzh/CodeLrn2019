package leetcode0203;
/*
203. Remove Linked List Elements

Remove all elements from a linked list of integers that have value val.

 */
public class Solution2 {

    public ListNode removeElements(ListNode head, int val) {
        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;
        ListNode prev = dummyHead;
        while(prev.next != null){
            if(prev.next.val ==val)
                prev.next = prev.next.next;
            else
                prev = prev.next;
        }
        return dummyHead.next;
    }

    public static void main(String[] args) {

    }
}
