package LinkList1.java;

public class DeleteNode {
	public static Node<Integer> deleteNode(Node<Integer> head, int pos){
		  if (head == null)
	            return head;
	        Node<Integer> temp = head;
	        if (pos == 0) {
	            head = temp.next;
	            return head;
	        }
	        for (int i = 0; temp != null && i < pos - 1;
	             i++)
	            temp = temp.next;

	        if (temp == null || temp.next == null)
	            return head;
	        Node<Integer> next = temp.next.next;
	        temp.next = next; 
	         return head;
	}
	public static void println(Node<Integer>head) {
		while(head!=null) {
			System.out.print(head.data+" ");
			head=head.next;
			
		}
	}


}
