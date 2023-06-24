// import java.io.*;
import java.util.* ;

	// Following is the structure of the Singly Linked List.	
	class LinkedListNode<T> 
    {
    	T data;
    	LinkedListNode<T> next;
    	public LinkedListNode(T data) 
        {
        	this.data = data;
    	}
	}


public class ReverseLinkedList 
{
    public static LinkedListNode<Integer> reverseLinkedList(LinkedListNode<Integer> head) 
    {
        // Write your code here!
		if(head == null) return head;
		
		Stack<LinkedListNode<Integer>> st=new Stack<>();
		while(head != null){
			st.push(head);
			head=head.next;
		}

		LinkedListNode<Integer> llhead=st.pop();
		LinkedListNode<Integer> llnode=llhead;

		while(!st.isEmpty()){
			LinkedListNode<Integer> temp=st.pop();
			llnode.next=temp;
			llnode=llnode.next;
			llnode.next=null;
		}
		
		return llhead;
    }
}
