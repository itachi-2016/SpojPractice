import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		long test, n, a, sum;
		Scanner sc = new Scanner(System.in);
		test = sc.nextLong();
		for (long i = 0; i < test; i++) {
			n = sc.nextLong();
			sum = 0;
			for (long j = 0; j < n; j++) {
				a = sc.nextLong();
				sum = (sum + a) % n;
			}
			if (sum == 0) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
}
