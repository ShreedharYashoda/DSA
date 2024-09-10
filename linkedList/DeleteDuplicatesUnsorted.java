//Leetcode 1836

import java.util.*;

class DeleteDuplicatesUnsorted{
    public static ListNode deleteDuplicatesUnsorted(ListNode head) {
        // Create a HashMap to store the frequency of each value in the linked list
        Map<Integer, Integer> map = new HashMap<>();

        // Initialize a pointer to traverse the list
        ListNode cur = head;

        // Traverse the list to count the frequency of each value
        while(cur != null){
            // Update the frequency count for the current value
            map.put(cur.val, map.getOrDefault(cur.val, 0) + 1);
            // Move to the next node
            cur = cur.next;
        }

        // Create a dummy node to handle edge cases more easily
        ListNode tempHead = new ListNode();
        tempHead.next = head;

        // Initialize pointers for previous node and current node
        ListNode prev = tempHead;
        cur = head;

        // Traverse the list again to remove duplicates
        while(cur != null){
            // If the current value has duplicates (frequency > 1)
            if(map.get(cur.val) > 1){
                // Remove the current node by updating the previous node's next pointer
                prev.next = cur.next;
                // Disconnect the current node from the list
                cur.next = null;
                // Reset the current pointer to the previous node (to continue the loop correctly)
                cur = prev;
            }
            // Move the previous pointer to the current node
            prev = cur;
            // Move to the next node
            cur = cur.next;
        }

        // Return the new head of the modified list
        return tempHead.next;
    }


	public static void main(String[] args){
			ListNode node = new ListNode(1);
			node.next = new ListNode(2);
			node.next.next = new ListNode(3);
			node.next.next.next = new ListNode(2);

			ListNode temp = node;
			while(temp != null){
				System.out.print(temp.val +" ");
				temp = temp.next;
			}
			System.out.println();

			ListNode ans = deleteDuplicatesUnsorted(node);

			while(ans != null){
				System.out.print(ans.val +" ");
				ans = ans.next;
			}
		}
}