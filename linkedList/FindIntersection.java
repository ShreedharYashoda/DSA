public class FindIntersection{

	// O(m+n) m is len of linkedlist1 and n is len of linkedList2
	public ListNode getIntersection(ListNode head1, ListNode head2) {
		// Initialize two pointers, x and y, starting at head1 and head2 respectively
		ListNode x = head1, y = head2;

		// Traverse both lists until the pointers meet
		while (x != y) {
			// If pointer x reaches the end of list1, redirect it to the head of list2
			if (x == null) {
				x = head2;
			} else {
				// Otherwise, move x to the next node
				x = x.next;
			}

			// If pointer y reaches the end of list2, redirect it to the head of list1
			if (y == null) {
				y = head1;
			} else {
				// Otherwise, move y to the next node
				y = y.next;
			}
		}

		// When the pointers meet, they either point to the intersection node or to null
		return x;
	}


	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);
		head.next.next.next.next.next = new ListNode(6);
		head.next.next.next.next.next.next = new ListNode(7);

		ListNode head2 = new ListNode(1);
		head2.next = new ListNode(2);
		head2.next.next = new ListNode(3);
		head2.next.next.next = new ListNode(4);

		head2.next.next.next.next = head.next;
		

		FindIntersection fi = new FindIntersection();
		ListNode res = fi.getIntersection(head, head2);
		System.out.println(res.val);

		
	}
}