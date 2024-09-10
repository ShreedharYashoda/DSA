Iterative traversal of binary trees is often achieved using a stack for Depth-First traversals (In-Order, Pre-Order, Post-Order) and a queue for Breadth-First (Level-Order) traversal. Below are the iterative versions of In-Order, Pre-Order, and Post-Order traversals.

### Iterative In-Order Traversal (Left, Root, Right)
In this approach, we use a stack to traverse the leftmost path first, then visit the node, and finally move to the right subtree.

```java
void iterativeInOrder(TreeNode root) {
	Stack<TreeNode> stack = new Stack<>();
	TreeNode current = root;

	while (current != null || !stack.isEmpty()) {
		// Reach the leftmost node of the current node
		while (current != null) {
			stack.push(current);
			current = current.left;
		}

		// Current must be null at this point
		current = stack.pop();
		System.out.print(current.value + " ");

		// Visit the right subtree
		current = current.right;
	}
}
```

### Iterative Pre-Order Traversal (Root, Left, Right)
In Pre-Order traversal, we visit the root first, then the left, followed by the right. We use a stack to keep track of nodes.

```java
void iterativePreOrder(TreeNode root) {
	if (root == null) {
		return;
	}

	Stack<TreeNode> stack = new Stack<>();
	stack.push(root);

	while (!stack.isEmpty()) {
		TreeNode current = stack.pop();
		System.out.print(current.value + " ");

		// Push right child first so that left is processed first
		if (current.right != null) {
			stack.push(current.right);
		}
		if (current.left != null) {
			stack.push(current.left);
		}
	}
}
```

### Iterative Post-Order Traversal (Left, Right, Root)
Post-Order traversal is trickier iteratively. A common method uses two stacks or modifies Pre-Order traversal logic.

**Method 1: Using Two Stacks**

```java
void iterativePostOrder(TreeNode root) {
	if (root == null) {
		return;
	}

	Stack<TreeNode> stack1 = new Stack<>();
	Stack<TreeNode> stack2 = new Stack<>();
	stack1.push(root);

	// Push nodes to the first stack
	while (!stack1.isEmpty()) {
		TreeNode current = stack1.pop();
		stack2.push(current);

		// Left child is pushed first so right is processed first in stack2
		if (current.left != null) {
			stack1.push(current.left);
		}
		if (current.right != null) {
			stack1.push(current.right);
		}
	}

	// Pop all items from the second stack
	while (!stack2.isEmpty()) {
		System.out.print(stack2.pop().value + " ");
	}
}
```

**Method 2: Using One Stack**

This approach simulates recursive post-order traversal using a single stack by keeping track of the last visited node.

```java
void iterativePostOrderSingleStack(TreeNode root) {
	Stack<TreeNode> stack = new Stack<>();
	TreeNode current = root;
	TreeNode lastVisited = null;

	while (current != null || !stack.isEmpty()) {
		// Reach the leftmost node of the current node
		while (current != null) {
			stack.push(current);
			current = current.left;
		}

		// Peek the top node from the stack
		TreeNode peekNode = stack.peek();

		// If the right node is null or has already been visited, visit this node
		if (peekNode.right == null || peekNode.right == lastVisited) {
			System.out.print(peekNode.value + " ");
			lastVisited = stack.pop();
		} else {
			// Move to the right node
			current = peekNode.right;
		}
	}
}
```

### Iterative Level-Order Traversal (Breadth-First Search)
This method uses a queue, which is already covered above but reiterated here for completeness.

```java
void levelOrderTraversal(TreeNode root) {
	if (root == null) {
		return;
	}
	Queue<TreeNode> queue = new LinkedList<>();
	queue.add(root);

	while (!queue.isEmpty()) {
		TreeNode currentNode = queue.poll();
		System.out.print(currentNode.value + " ");

		if (currentNode.left != null) {
			queue.add(currentNode.left);
		}
		if (currentNode.right != null) {
			queue.add(currentNode.right);
		}
	}
}
```

### Summary of Iterative Approaches
- **In-Order:** Uses a stack to traverse leftmost nodes first.
- **Pre-Order:** Uses a stack, pushing right before left.
- **Post-Order:** Uses two stacks or a modified approach with one stack.
- **Level-Order:** Uses a queue to visit nodes level by level.

These iterative methods are efficient and avoid the limitations of recursion, such as stack overflow for deep trees. Let me know if you have any questions!