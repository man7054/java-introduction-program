package LinkList1.java;

public class LengthofLL {
	public static int length(Node<Integer> head) {
		Node<Integer>temp=head;
		int c=0;
		while(temp!=null) {
			c++;
			temp=temp.next;
		}
		return c;
	}
}
