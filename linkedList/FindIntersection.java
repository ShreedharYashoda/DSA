public class FindIntersection{

	// O(m+n) m is len of linkedlist1 and n is len of linkedList2
	public ListNode getIntersection(ListNode head1, ListNode head2){

		ListNode x = head1, y = head2;
		
		while(x != y) {
			
			if(x == null){
				x = head2;
			} else {
				x= x.next;
			}

			if(y == null){
				y = head1;
			} else {
				y = y.next;
			}
		}

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