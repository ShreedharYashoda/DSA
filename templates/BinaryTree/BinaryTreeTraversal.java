import java.util.*;

public class BinaryTreeTraversal {

	void preOrder(TreeNode root) {
		if (root == null)
			return;
		System.out.print(root.val + " ");
		preOrder(root.left);
		preOrder(root.right);
	}

	void inOrder(TreeNode root) {
		if (root == null)
			return;
		inOrder(root.left);
		System.out.print(root.val + " ");
		inOrder(root.right);
	}

	void postOrder(TreeNode root) {
		if (root == null)
			return;
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.val + " ");
	}

	void levelorder(TreeNode root) {
		if (root == null)
			return;
		Deque<TreeNode> q = new ArrayDeque<>();
		q.addLast(root);
		while (q.isEmpty() == false) {
			int size = q.size();
			for (int i = 0; i < size; i++) {
				TreeNode node = q.removeFirst();
				System.out.println(node.val + " ");
				if (node.left != null)
					q.addLast(node.left);
				if (node.right != null)
					q.addLast(node.right);
			}
			System.out.println();
		}
	}

	// https://leetcode.com/problems/validate-binary-search-tree/
	// https://leetcode.com/problems/minimum-absolute-difference-in-bst/
	// https://leetcode.com/problems/convert-bst-to-greater-tree/
}
