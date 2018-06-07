import java.util.Scanner;
import java.util.Stack;

public class Main {

	static StringBuilder RPN(String a) {
		StringBuilder sb = new StringBuilder("");
		Stack<Character> s = new Stack<>();
		for (int i = 0; i < a.length(); i++) {
			if (Character.isLetter(a.charAt(i))) {
				sb.append(a.charAt(i));
			} else if (a.charAt(i) == ')') {
				sb.append(s.peek());
				s.pop();
			} else if (a.charAt(i) != '(') {
				s.push(a.charAt(i));
			}
		}
		return sb;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T;
		String S;
		T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			S = sc.next();
			System.out.println(RPN(S));
		}
	}
}
