import java.util.*;

public class DequeImpl {
	public static void main(String[] args) {
		Deque<Integer> s = new ArrayDeque<>();
		s.addLast(0); // 0
		s.addLast(1); // 0,1
		s.addLast(2); // 0,1,2
		s.removeLast(); // 0,1
		s.removeLast(); // 0

		Deque<Integer> q = new ArrayDeque<>();
		q.addLast(1); // 1
		q.addLast(2); // 1,2
		q.addLast(3); // 1,2,3
		q.removeFirst(); // 2,3
		q.removeFirst(); // 3

		Deque<Integer> ll = new ArrayDeque<>();
		ll.addLast(1); // 1
		ll.addLast(2); // 1,2
		ll.addFirst(0); // 0,1,2
		ll.removeLast(); // 0,1
		ll.removeFirst(); // 1
	}
}


