public class MergeSortedLinkedList{

	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(3);
		l1.next.next = new ListNode(5);

		ListNode l2 = new ListNode(2);
		l2.next = new ListNode(4);
		l2.next.next = new ListNode(6);
		l2.next.next.next = new ListNode(7);

		ListNode mergedLinkedList = mergeSortedLists(l1, l2);
		printList(mergedLinkedList);
		
	}

	public static ListNode mergeSortedLists(ListNode l1, ListNode l2) {
		ListNode dummy = new ListNode(0);
		ListNode head = dummy;

		while(l1 != null && l2 != null) {
			if(l1.val <= l2.val) {
				head.next = l1;
				l1 = l1.next;
			}else {
				head.next = l2;
				l2 = l2.next;
			}
			head = head.next;
		}

		if(l1 != null) {
			head.next = l1;
		}else if(l2 != null){
			head.next = l2;
		}

		return dummy.next;
	}

	public static void printList(ListNode l) {
		while(l != null) {
			System.out.print(l.val + " ");
			l = l.next;
		}
	}
	
}