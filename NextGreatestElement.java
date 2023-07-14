import java.util.* ; 

public class NextGreatestElement {
	
	public static int[] nextGreater(int[] arr, int n) {	
		//Write Your code here
		Stack<Integer> stack = new Stack<>();
		int[] ng = new int[n];
		for (int i = n - 1; i >= 0; i--) {
			while (!stack.isEmpty() && stack.peek() <= arr[i])
				stack.pop();
			if (stack.isEmpty())
				ng[i] = -1;
			else
				ng[i] = stack.peek();
			stack.push(arr[i]);
		}
		return ng;
	}

}
