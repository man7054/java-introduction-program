package BinaryTree.java;

public class ReplaceNodeWithDepth {
	public static void changeToDepthTree(BinaryTreeNode<Integer> root) {
		changeTodepthTree(root,0);
		
	}

	public static void changeTodepthTree(BinaryTreeNode<Integer> root, int i) {
		if(root==null) {
			return;
		}
		root.data=i;
		changeTodepthTree(root.left,i+1);
		changeTodepthTree(root.right,i+1);
		
	}
}
