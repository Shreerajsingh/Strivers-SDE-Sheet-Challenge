
class Node {
    public int data;
    public Node next;
    public Node prev;

    Node()
    {
        this.data = 0;
        this.next = null;
        this.prev = null;
    }

    Node(int data)
    {
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    Node(int data, Node next)
    {
        this.data = data;
        this.next = next;
        this.prev = next;
    }
 }

 public class RemoveKthNodeFromEnd
 {
     public static Node removeKthNode(Node head, int K)
     {
         // Write your code here.
         Node temp=head;
 
         int count=0;
 
         while(temp!=null){
 
             count++;
 
             temp=temp.next;
 
         }
 
         int l=count-K,p=0;
 
         Node temp1=head;
 
         if(l==0){
 
             head=head.next;
 
             return head;
 
         }
 
         while(temp1!=null){
 
             p++;
 
             if(p==l){
 
                 temp1.next=temp1.next.next;
 
             }
 
             temp1=temp1.next;
 
         }
 
         return head;
     }
 }