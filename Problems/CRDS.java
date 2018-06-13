import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) throws IOException {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int mod = 1000007;
		while (t-- > 0) {
			long n = sc.nextLong();
			long ans = (3 * n * (n - 1)) / 2 + 2 * n;
			System.out.println(ans % mod);
		}
	}
}
