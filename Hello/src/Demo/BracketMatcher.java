package Demo;

import java.util.Scanner;
import java.util.Stack;

public class BracketMatcher {
	public static String BracketMatcher(String str) {
		System.out.println("11111");
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);

			if (c == '(')
				stack.push(c);
			else if (c == ')') {
				if (stack.isEmpty())
					return "0";
				else
					stack.pop();
			}
		}
		return str;
	}

	public static void main(String[] args) {
		System.out.println("22222");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: "+BracketMatcher(sc.next()));

	}

}
