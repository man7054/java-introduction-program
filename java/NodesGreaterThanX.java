package BinaryTree.java;

public class NodesGreaterThanX {
	public static int c=0;
	public static int countNodesGreaterThanX(BinaryTreeNode<Integer> root, int x) {
		if(root==null) {
			return -1;
		}
		if(root.data>x) {
			c++;
		}
		countNodesGreaterThanX(root.left,x);
		countNodesGreaterThanX(root.right,x);
		return c;
	}
}
