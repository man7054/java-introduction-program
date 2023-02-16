package BinaryTree.java;

public class HeightOfTree {
	public static int height(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return 0;
		}
		int lefth=height(root.left);
		int righth=height(root.right);
		int total=1+Math.max(lefth, righth);
	}
}
