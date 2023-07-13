import java.util.*;
// import java.io.*;

public class NextSmallestElement {
    static ArrayList<Integer> nextSmallerElement(ArrayList<Integer> arr, int n) {
        ArrayList<Integer> result = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            int current = arr.get(i);

            if (stack.isEmpty()) {
                result.add(-1);
            } else if (stack.peek() < current) {
                result.add(stack.peek());
            } else {
                while (!stack.isEmpty() && stack.peek() >= current) {
                    stack.pop();
                }
                if (stack.isEmpty()) {
                    result.add(-1);
                } else {
                    result.add(stack.peek());
                }
            }

            stack.push(current);
        }

        Collections.reverse(result);
        return result;
    }
}
