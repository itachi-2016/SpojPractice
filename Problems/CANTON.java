import java.io.IOException;
import java.util.Scanner;

public class Main {
	static String solve(int n) {
		int no = (int) ((Math.sqrt(n * 8 + 1) - 1) / 2);
		if (((no * (no + 1)) / 2) < n) {
			no++;
		}
		int num, den;
		if (no % 2 == 0) {
			num = n - ((no * (no - 1)) / 2);
			den = no - num + 1;
		} else {
			den = n - ((no * (no - 1)) / 2);
			num = no - den + 1;
		}
		return num + "/" + den;
	}

	public static void main(String args[]) throws IOException {
		Scanner sc = new Scanner(System.in);
		int t, n;
		t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			n = sc.nextInt();
			System.out.println("TERM " + n + " IS " + solve(n));
		}
	}
}
