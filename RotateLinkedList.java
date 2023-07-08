class Node {
    public int data;
    public Node next;

    Node()
    {
        this.data = 0;
        this.next = null;
    }

    Node(int data)
    {
        this.data = data;
        this.next = null;
    }

    Node(int data, Node next)
    {
        this.data = data;
        this.next = next;
    }
}

 public class RotateLinkedList {
    public static Node rotate(Node head, int k) {
        // Write your code here.
        if(head==null || head.next==null || k==0) return head;

        int len = 1;
        Node temp = head;

        while(temp.next!=null){
            len++;
            temp = temp.next;
        }

        temp.next = head;

        if(k>=len) k = (k-len)%len;

        int flag=0;
        temp = head;

        while(flag!=(len-k)-1){
            flag++;
            temp = temp.next;
        }

        head = temp.next;
        temp.next = null;

        return head;
    }
}