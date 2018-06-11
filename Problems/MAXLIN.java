import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		long r;
		long ans;
		for (int i = 0; i <= t; i++) {
			r = sc.nextLong();
			ans = 4 * r * r;
			System.out.println("Case " + (i + 1) + ": " + ans + ".25");
		}
	}
}
