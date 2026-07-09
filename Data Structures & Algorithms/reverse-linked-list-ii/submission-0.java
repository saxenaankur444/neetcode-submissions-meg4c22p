/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
		ListNode dummy = new ListNode(0);
		dummy.next = head;
		ListNode prev = dummy;
		for (int i = 0; i < left - 1; i++) {
			prev = prev.next;
		}
		ListNode sublistHead = prev.next;
		ListNode sublistTail = sublistHead;
		for (int i = 0; i < right - left; i++) {
			sublistTail = sublistTail.next;
		}
		ListNode next = sublistTail.next;

		prev.next = null;
		sublistTail.next = null;

		ListNode curr = sublistHead;
		ListNode p = null;
		while (curr != null) {
			ListNode t = curr.next;
			curr.next = p;
			p = curr;
			curr = t;
		}

		prev.next = p;
		ListNode z = p;
		while (z.next != null) {
			z = z.next;
		}
		z.next = next;

		return dummy.next;
	}
}