import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while (n != 0) {
			int arr[] = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			boolean ans = true;
			for (int i = 0; i < n; i++) {
				if (arr[arr[i] - 1] != i + 1) {
					ans = false;
					break;
				}
			}
			if (ans) {
				System.out.println("ambiguous");
			} else {
				System.out.println("not ambiguous");
			}
			n = sc.nextInt();
		}
	}
}
