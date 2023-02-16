package LinkList1.java;

public class AppendLastNToFirst {
	public static Node<Integer> appendLastNToFirst(Node<Integer> head, int n){
		if(head==null) {
			return head;
		}
		else if(n==0) {
			return head;
		}
		int count=0;
		Node<Integer> temp=head;
		while(temp!=null) {
			count++;
			temp=temp.next;
		}
		int c=count-n;
		int counts=0;
		Node<Integer>temp1=head;
		while(counts<c-1) {
			temp1=temp1.next;
		}
		Node<Integer>temp2=temp1.next;
		Node<Integer>temp3=temp1.next;
		while(temp2!=null) {
			temp2=temp2.next;
		}
		temp2.next=head;
		temp1=null;
		return temp3;
	}
}
