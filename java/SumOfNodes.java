package BinaryTree.java;

public class SumOfNodes {
	public static int sum=0;
	public static int getSum(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return 0;
		}
		 sum=sum+root.data;
		getSum(root.left);
		getSum(root.right);
		return sum;
	}

}
