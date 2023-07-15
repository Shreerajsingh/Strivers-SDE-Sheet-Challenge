import java.util.* ;

public class StackSorting {

	public static void sortStack(Stack<Integer> stack) {
		// Write your code here.
		if(stack.empty()) return;

		int num=stack.pop();
		sortStack(stack);
		insert(stack, num);
	}

	public static void insert(Stack<Integer> stack, int num){
		if(stack.empty() || stack.peek()<=num){
			stack.push(num);
			return;
		}
		int num2=stack.pop();
		insert(stack,num);
		stack.push(num2);
	}
    
}