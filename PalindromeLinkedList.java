// import java.util.* ;
// import java.io.*; 
	
class LinkedListNode<T> {
	T data;
    LinkedListNode<T> next;

	public LinkedListNode(T data) {
    	this.data = data;
	}
}


public class PalindromeLinkedList {

	public static boolean isPalindrome(LinkedListNode<Integer> head) {
		if (head == null || head.next == null)
            return true;

        LinkedListNode<Integer> fh = head;
        LinkedListNode<Integer> temp = head;

        // Get the first half of linked list
        while (temp != null && temp.next != null) {
            fh = fh.next;
            temp = temp.next.next;
        }

        LinkedListNode<Integer> prev = null; //head of second linked list
        LinkedListNode<Integer> current = fh;
        LinkedListNode<Integer> next;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        // Compare the first and second linked list
        LinkedListNode<Integer> p1 = head;
        LinkedListNode<Integer> p2 = prev;

        while (p2 != null) {
            if (!p1.data.equals(p2.data))
                return false;

            p1 = p1.next;
            p2 = p2.next;
        }

        return true;
	}
}
