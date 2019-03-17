# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class ListNode(object):
    def __init__(self, x):
        self.val = x
        self.next = None


class Solution(object):
    def reverseList(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        cur = head
        prev = None
        while cur:
            cur.next, cur, prev = prev, cur.next, cur
        return prev


if __name__ == '__main__':
    node1 = ListNode(1);
    node2 = ListNode(2);
    node3 = ListNode(3);
    node1.next = node2;
    node2.next = node3;

    solution = Solution()
    newlist = solution.reverseList(node1)

    print newlist.val
    print newlist.next.val
    print newlist.next.next.val
