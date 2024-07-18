import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		String str = bf.readLine();

		Stack<Integer> stack = new Stack<>();
		for (int i = 0; i < str.length(); i++) {
			Character ch = str.charAt(i);
			if (ch == 'C') {
				stack.add(12);
			} else if (ch == 'O') {
				stack.add(16);
			} else if (ch == 'H') {
				stack.add(1);
			} else if (Character.isDigit(ch)) {
				int num = stack.pop();
				stack.add(num * (ch - '0'));
			} else if (ch == '(') {
				stack.add(-1);
			} else if (ch == ')') {
				int num = 0;
				while (stack.peek() != -1) {
					num += stack.pop();
				}
				stack.pop();
				stack.add(num);
			}
		}

		int result = 0;
		while (!stack.isEmpty()) {
			result += stack.pop();
		}

		System.out.println(result);
	}
}