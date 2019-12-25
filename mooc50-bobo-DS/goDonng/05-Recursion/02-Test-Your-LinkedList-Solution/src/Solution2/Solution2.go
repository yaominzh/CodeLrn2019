package Solution2

import "Play-with-Data-Structures/05-Recursion/02-Test-Your-LinkedList-Solution/src/ListNode"

func RemoveElements2(head *ListNode.ListNode, val int) *ListNode.ListNode {
	for head != nil && head.Val == val {
		head = head.Next
	}
	if head == nil {
		return nil
	}

	prev := head
	for prev.Next != nil {
		if prev.Next.Val == val {
			prev.Next = prev.Next.Next
		} else {
			prev = prev.Next
		}
	}

	return head
}
