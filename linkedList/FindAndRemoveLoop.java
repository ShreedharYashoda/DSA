import java.util.Set;
import java.util.HashSet;

public class FindAndRemoveLoop {

	public ListNode findAndRemoveLoopUsingExtraSpace(ListNode head) {
		Set<ListNode> seen = new HashSet<>();
		ListNode cur = head, prev = null;

		while (cur != null) {
			if (!seen.contains(cur)) {
				seen.add(cur);
				prev = cur;
				cur = cur.next;
			} else {
				prev.next = null;
				return head;
			}
		}

		return head;
	}

	public ListNode findAndRemoveLoopUsingFloydCycleDetection(ListNode head) {
		
		ListNode slow = head, fast = head;

		while(fast != null) {
			slow = slow.next;
			fast = fast.next.next;

			if(fast == null) {
				return head;
			}

			if(slow == fast) {
				slow = head;
				break;
			}
		}

		ListNode prev = null;
		
		while(slow != fast) {
			slow = slow.next;
			prev = fast;
			fast = fast.next;
		}

		prev.next = null;

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