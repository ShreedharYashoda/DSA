Iterative graph traversal methods use data structures like stacks and queues to replace the recursive calls used in their recursive counterparts. Here's how you can implement iterative versions of Depth-First Search (DFS) and Breadth-First Search (BFS).

### Graph Representation
We'll continue using an adjacency list representation for the graph:

```java
import java.util.*;

// Graph class with adjacency list representation
class Graph {
	private final Map<Integer, List<Integer>> adjList = new HashMap<>();

	// Method to add an edge in the graph
	public void addEdge(int src, int dest) {
		adjList.computeIfAbsent(src, k -> new ArrayList<>()).add(dest);
		adjList.computeIfAbsent(dest, k -> new ArrayList<>()).add(src); // For undirected graph
	}

	public List<Integer> getAdjVertices(int vertex) {
		return adjList.getOrDefault(vertex, new ArrayList<>());
	}
}
```

### 1. Iterative Depth-First Search (DFS)
DFS can be implemented iteratively using a stack. The idea is to push the starting node onto the stack, visit nodes, and push adjacent nodes onto the stack as you traverse.

**Iterative DFS Implementation:**

```java
class GraphTraversal {

	// Iterative DFS method
	public void iterativeDFS(int startVertex, Graph graph) {
		Set<Integer> visited = new HashSet<>();
		Stack<Integer> stack = new Stack<>();
		stack.push(startVertex);

		while (!stack.isEmpty()) {
			int vertex = stack.pop();

			// If the node has not been visited, mark it as visited
			if (!visited.contains(vertex)) {
				visited.add(vertex);
				System.out.print(vertex + " ");

				// Push all adjacent vertices onto the stack
				for (int neighbor : graph.getAdjVertices(vertex)) {
					if (!visited.contains(neighbor)) {
						stack.push(neighbor);
					}
				}
			}
		}
	}
}

// Example usage
public class Main {
	public static void main(String[] args) {
		Graph graph = new Graph();
		graph.addEdge(0, 1);
		graph.addEdge(0, 2);
		graph.addEdge(1, 2);
		graph.addEdge(2, 3);
		graph.addEdge(3, 4);

		GraphTraversal traversal = new GraphTraversal();
		System.out.print("DFS Iterative: ");
		traversal.iterativeDFS(0, graph);
	}
}
```

### 2. Iterative Breadth-First Search (BFS)
BFS is typically implemented using a queue, which allows traversal level-by-level. Nodes are enqueued as they are discovered and dequeued as they are visited.

**Iterative BFS Implementation:**

```java
class GraphTraversal {

	// Iterative BFS method
	public void iterativeBFS(int startVertex, Graph graph) {
		Set<Integer> visited = new HashSet<>();
		Queue<Integer> queue = new LinkedList<>();
		visited.add(startVertex);
		queue.add(startVertex);

		while (!queue.isEmpty()) {
			int vertex = queue.poll();
			System.out.print(vertex + " ");

			// Enqueue all unvisited adjacent vertices
			for (int neighbor : graph.getAdjVertices(vertex)) {
				if (!visited.contains(neighbor)) {
					visited.add(neighbor);
					queue.add(neighbor);
				}
			}
		}
	}
}

// Example usage
public class Main {
	public static void main(String[] args) {
		Graph graph = new Graph();
		graph.addEdge(0, 1);
		graph.addEdge(0, 2);
		graph.addEdge(1, 2);
		graph.addEdge(2, 3);
		graph.addEdge(3, 4);

		GraphTraversal traversal = new GraphTraversal();
		System.out.print("BFS Iterative: ");
		traversal.iterativeBFS(0, graph);
	}
}
```

### Time Complexities
- **DFS Iterative (using stack):** **O(V + E)**
- **BFS Iterative (using queue):** **O(V + E)**

### Summary
- **DFS (Iterative):** Uses a stack to explore deeply before backtracking.
- **BFS (Iterative):** Uses a queue to explore nodes level by level.

These iterative approaches avoid the potential pitfalls of recursion, such as stack overflow on deep graphs, while maintaining the same time complexity as their recursive counterparts. Let me know if you need further clarifications!