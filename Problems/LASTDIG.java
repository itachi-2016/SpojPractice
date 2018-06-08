import java.io.IOException;
import java.util.Scanner;

public class Main {
	static long solve(long a, long b) {
		long ans = 1;
		while (b > 0) {
			if (b % 2 == 1) {
				ans = (ans * a) % 10;
			}
			a = (a * a) % 10;
			b /= 2;
		}
		return ans;
	}

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long a, b;
		for (int i = 0; i < n; i++) {
			a = sc.nextLong();
			b = sc.nextLong();
			System.out.println(solve(a, b));
		}
	}
}
