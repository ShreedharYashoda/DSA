import java.util.Collections;
import java.util.PriorityQueue;

class Pq{
	public static void main(String[] args){

		//Min Heap by default
		PriorityQueue<Integer> minHeap = new PriorityQueue<>();
		minHeap.add(10);
		minHeap.add(20);
		minHeap.add(30);
		System.out.println(minHeap.peek());
		System.out.println(minHeap.poll());
		System.out.println(minHeap.peek());
		System.out.println();

		//Max Heap 
		PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
		maxHeap.add(10);
		maxHeap.add(20);
		maxHeap.add(30);
		System.out.println(maxHeap.peek());
		System.out.println(maxHeap.poll());
		System.out.println(maxHeap.peek());
		System.out.println();


		PriorityQueue<Item> pq = new PriorityQueue<>();

		// Add items to the PriorityQueue
		pq.add(new Item(0, 0));
		System.out.println("After adding Item(0, 0): " + pq);

		pq.add(new Item(1, 3));
		System.out.println("After adding Item(1, 3): " + pq);

		// Peek the top item of the PriorityQueue
		System.out.println("Peek: " + pq.peek());

		// Poll items from the PriorityQueue
		System.out.println("Poll: " + pq.poll());
		System.out.println("After polling: " + pq);

		System.out.println("Poll: " + pq.poll());
		System.out.println("After polling: " + pq);
	}


	// This code defines a static class `Item` that implements the `Comparable<Item>` interface. The `Item` class has two fields, `node` and `dist`. The `compareTo` method orders `Item` objects based on the `dist` field in ascending order. The `toString` method provides a string representation of an `Item` object.
	static class Item implements Comparable<Item> {
		int node;
		int dist;

		public Item(int node, int dist) {
			this.node = node;
			this.dist = dist;
		}

		@Override
		public int compareTo(Item item) {
			if (this.dist > item.dist) return 1;
			else if (this.dist < item.dist) return -1;
			else return 0;
		}

		@Override
		public String toString() {
			return "Item{" +
					"node=" + node +
					", dist=" + dist +
					'}';
		}
	}

}