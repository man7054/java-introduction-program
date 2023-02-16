package LinkList1.java;

public class searchNode {
	public static int findNode(Node<Integer> head, int n) {
		if(head==null) {
			return -1;
		}
		Node<Integer>temp=head;
		int c=0;
		while(temp!=null) {
			if(temp.data==n) {
				return c;
			}
			c++;
		}
	
	return -1;
	}
}
