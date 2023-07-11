
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

 public class IntersectionOf2LinkedList {
    public static int findIntersection(Node first, Node second) {
        //Write your code here
        Node d1 = first;
        Node d2 = second;

        while(d1!=d2){

            if(d1==null){
                d1=second;
            }
            else{
                d1=d1.next;
            }

            if(d2==null){
                d2=first;
            }
            else{
                d2= d2.next;
            }
        }

        return d2.data;
    }
}