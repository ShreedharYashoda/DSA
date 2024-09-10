import java.util.Set;
import java.util.HashSet;

public class FindAndRemoveLoop {

	public ListNode findAndRemoveLoopUsingExtraSpace(ListNode head) {
		// Create a HashSet to store visited nodes
		Set<ListNode> seen = new HashSet<>();

		// Initialize pointers for the current node and the previous node
		ListNode cur = head, prev = null;

		// Traverse the linked list
		while (cur != null) {
			// If the current node has not been seen before
			if (!seen.contains(cur)) {
				// Add the current node to the HashSet
				seen.add(cur);
				// Move the previous pointer to the current node
				prev = cur;
				// Move to the next node
				cur = cur.next;
			} else {
				// If the current node has been seen before, it means there's a loop
				// Break the loop by setting the previous node's next pointer to null
				prev.next = null;
				// Return the head of the modified list
				return head;
			}
		}

		// If no loop was found, return the head of the list
		return head;
	}


	

	public static void main(String[] args) {

		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);
		head.next.next.next.next.next = new ListNode(6);
		head.next.next.next.next.next.next = new ListNode(7);
		head.next.next.next.next.next.next.next = head.next.next.next;

		FindAndRemoveLoop obj = new FindAndRemoveLoop();
		ListNode res = obj.findAndRemoveLoopUsingExtraSpace(head);

		while (res != null) {
			System.out.print(res.val + " -> ");
			res = res.next;
		}
		System.out.print("null");
		System.out.println();

		head.next.next.next.next.next.next.next = head.next.next.next;

		ListNode res2 = obj.findAndRemoveLoopUsingFloydCycleDetection(head);

		while (res2 != null) {
			System.out.print(res2.val + " -> ");
			res2 = res2.next;
		}
		System.out.print("null");
		System.out.println();
	}
}