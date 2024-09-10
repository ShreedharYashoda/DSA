Traversing binary trees involves visiting each node in a specific order. The three main types of traversal techniques for binary trees are:

1. **In-Order Traversal** (Left, Root, Right)
2. **Pre-Order Traversal** (Root, Left, Right)
3. **Post-Order Traversal** (Left, Right, Root)

Additionally, there’s **Level-Order Traversal** (BFS), which visits nodes level by level.

### Binary Tree Node Structure
Here’s a basic structure of a binary tree node in Java:

```java
class TreeNode {
	int value;
	TreeNode left;
	TreeNode right;

	TreeNode(int value) {
		this.value = value;
		left = null;
		right = null;
	}
}
```

### 1. In-Order Traversal (Left, Root, Right)
In-Order traversal visits the left subtree, then the root, and finally the right subtree. This traversal is particularly useful for binary search trees (BSTs) as it returns nodes in ascending order.

**Recursive Implementation:**

```java
void inOrderTraversal(TreeNode node) {
	if (node == null) {
		return;
	}
	inOrderTraversal(node.left);
	System.out.print(node.value + " ");
	inOrderTraversal(node.right);
}
```

### 2. Pre-Order Traversal (Root, Left, Right)
Pre-Order traversal visits the root first, then the left subtree, followed by the right subtree. It is often used to create a copy of the tree or to get a prefix expression of an expression tree.

**Recursive Implementation:**

```java
void preOrderTraversal(TreeNode node) {
	if (node == null) {
		return;
	}
	System.out.print(node.value + " ");
	preOrderTraversal(node.left);
	preOrderTraversal(node.right);
}
```

### 3. Post-Order Traversal (Left, Right, Root)
Post-Order traversal visits the left subtree, then the right subtree, and finally the root. It is useful for deleting a tree because it deletes child nodes before the parent.

**Recursive Implementation:**

```java
void postOrderTraversal(TreeNode node) {
	if (node == null) {
		return;
	}
	postOrderTraversal(node.left);
	postOrderTraversal(node.right);
	System.out.print(node.value + " ");
}
```

### 4. Level-Order Traversal (Breadth-First Search)
Level-Order traversal visits nodes level by level from top to bottom and left to right. This traversal uses a queue to manage the nodes.

**Iterative Implementation Using a Queue:**

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

### Summary of Traversal Orders
- **In-Order:** Used for BSTs to get sorted output.
- **Pre-Order:** Useful for creating a copy of the tree.
- **Post-Order:** Used for deleting trees or postfix expressions.
- **Level-Order:** Commonly used for breadth-first traversal and finding the shortest path.

If you need help with non-recursive (iterative) versions of these traversals or specific traversal-related algorithms, let me know!