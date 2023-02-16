package LinkList1.java;
import java.util.*;
public class LinkListUse {
	public static Node<Integer> createLinkedList(){
		Node<Integer> n1=new Node(10);
		Node<Integer> n2=new Node(20);
		Node<Integer> n3=new Node(30);
		Node<Integer> n4=new Node(40);
		Node<Integer> n5=new Node(40);
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		n5.next=null;
		/*System.out.println("n1"+n1+"data"+n1.data+"next"+n1.next);
		System.out.println("n2"+n2+"data"+n2.data+"next"+n2.next);
		System.out.println("n3"+n3+"data"+n3.data+"next"+n3.next);
		System.out.println("n4"+n4+"data"+n4.data+"next"+n4.next);*/
	    return n1;
	}
	public static void print(Node<Integer> head) {
		//System.out.println(head.data);
		//System.out.println(head.next.data);
		//System.out.println(head.next.next.data);
		while(head!=null) {
			System.out.print(head.data+" ");
			head=head.next;
		}
		//while(head!=null) {
			//System.out.println(head.data+"");
			//head=head.next;
		//}
	}
	/*public static void increament(Node<Integer> head) {
		Node<Integer>temp=head;
		while(temp!=null) {
		temp.data++;
		temp=temp.next;
		}
	}
	public static int length(Node<Integer>head) {
		Node<Integer>temp=head;
		int count=0;
		while(temp!=null) {
			count++;
			temp=temp.next;
		}
		return count;
	}
	public static Node<Integer> takeInput(){
		Scanner s=new Scanner(System.in);
		int data =s.nextInt();
		Node<Integer>head=null,tail=null;
		while(data!=-1) {
		Node<Integer>currentnode=new Node<Integer>(data);
		if(head==null) {
			head=currentnode;
			tail=currentnode;
		}
		//else {
			//Node<Integer>tail=head;
			//while(tail.next!=null) {
				//tail=tail.next;
			//}
			tail.next=currentnode;
			tail=currentnode;//tail=tail.next;
		//}
			data=s.nextInt();
		
		}
		return head;
	}
	public static Node<Integer> insert(Node<Integer>head,int elem,int pos) {
		Node<Integer>nodetoinsert=new Node<Integer>(elem);
		
		if(pos==0){
			nodetoinsert.next=head;
			return nodetoinsert;

		}
		else{
		int count=0;
		Node<Integer>prev=head;
         while(count<pos-1){
			 if(prev==null){
				 return head; 
			 }
			 count++;
			 prev=prev.next;
		 }
		 nodetoinsert.next=prev.next;
		 prev.next=nodetoinsert;
		}
	
		 return head;*/
	//}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Node<Integer> head=createLinkedList();
	LengthofLL ll=new LengthofLL();
	searchNode de=new searchNode();
	
		//Node<Integer>head=takeInput();
		//increament(head);
		
		//takeInput();
		//insert(head,90,0);
	    print(head);
		System.out.println(" "+de.findNode(head,20));
		//System.out.println(length(head));
		//de.deleteNode(head,0);
		//de.println(head);
		
	

	}

}
