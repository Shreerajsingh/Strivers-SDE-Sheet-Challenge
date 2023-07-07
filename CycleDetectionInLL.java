import java.util.*;

class Node {
    public int data;
    public Node next;

    Node(){
        this.data = 0;
        this.next = null;
    }

    Node(int data){
        this.data = data;
        this.next = null;
    }

    Node(int data, Node next){
        this.data = data;
        this.next = next;
    }
}

public class CycleDetectionInLL {

    public static boolean detectCycle(Node head) {
        //Your code goes here
         if (head == null || head.next == null) {
            return false;
        }

        HashSet<Node> visited = new HashSet<>();
        Node current = head;

        while (current != null) {
            if (visited.contains(current)) {
                return true;
            }
            visited.add(current);
            current = current.next;
        }

        return false;
    }
}