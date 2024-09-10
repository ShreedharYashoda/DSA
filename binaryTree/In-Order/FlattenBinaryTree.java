public class FlattenBinaryTree{

	static TreeNode head = null, prev = null;

	public void flattenBinaryTree(TreeNode root){
		if(root == null) return;

		flattenBinaryTree(root.left);

		if(head == null){
			head = root;
		} else {
			root.left = prev;
			prev.right = root;
		}

		prev = root;

		flattenBinaryTree(root.right);		
	}

	public static void main(String[] args) {

		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.left.right = new TreeNode(9);
		root.left.right = new TreeNode(6);
		root.right.right = new TreeNode(5);
		root.right.left = new TreeNode(7);
		root.right.left.right = new TreeNode(8);
		/*
		                   1
						2     3
					  4   6  7  5
						9     8
		*/

		FlattenBinaryTree fbt = new FlattenBinaryTree();

		fbt.flattenBinaryTree(root);

		TreeNode cur = head;

		while(cur != null) {
			System.out.print(cur.val + " <=> ");
			cur = cur.right;
		}
		System.out.print("null");

		System.out.println();
	}
}