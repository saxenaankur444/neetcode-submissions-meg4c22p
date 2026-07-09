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
    public ListNode removeNthFromEnd(ListNode head, int n) {

		ListNode dummy = new ListNode(0);
		dummy.next = head;
		ListNode t1 = dummy;
		int size = 0;
		while (t1 != null) {
			size++;
			t1 = t1.next;
		}
		if (n > size - 1 || size < 1)
			return null;
		int previndex = size - n - 1;
		ListNode res = dummy;
		while (previndex > 0) {
			res = res.next;
			previndex--;
		}
		res.next = res.next.next;

		return dummy.next;	
    }
}
