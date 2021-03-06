import java.util.Stack;

public class Solution {
	    public static boolean isValid(String s) {
		Stack<Character> stack = new Stack<Character>();
		for (char c : s.toCharArray()) {
			if (c == '(')
				stack.push(')');
			else if (c == '{')
				stack.push('}');
			else if (c == '[')
				stack.push(']');
			else if (stack.isEmpty() || stack.pop() != c)
				return false;
		}
		return stack.isEmpty();
		
	}
	    public static void main(String[] args) {
			System.out.println("Getting the input from user");
			String s = "{[](}}";
            boolean result = isValid(s);
			System.out.println(result);
			
	}
}
