package LinkList1.java;

public class InsertNodeInLL {
	public static Node<Integer> insert(Node<Integer> head, int pos, int data){
	    Node<Integer>targetNode=new Node<>(data);
	    if(pos==0) {
	    	targetNode.next=head;
	    	return targetNode;
	    }else {
	    	int count=0;
	    	Node<Integer>prev=head;
	    	while(count>pos-1) {
	    		if(prev==null) {
	    			return head;
	    		}
	    		prev=prev.next;
	    	}
	    	targetNode.next=prev.next;
	    	prev.next=targetNode;
	    	return head;
	    }
	    
	}
}
