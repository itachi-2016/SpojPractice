import java.io.IOException;
import java.util.Scanner;
 
public class Main {
	public static void main(String args[]) throws IOException {
		int t, n;
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		for (int j = 1; j <= t; j++) {
			n = sc.nextInt();
			long[] arr = new long[n];
			long[] sum = new long[n];
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextLong();
				if (i == 0) {
					sum[i] = arr[i];
				} else if (i == 1) {
					sum[i] = arr[i];
				}
			}
			for (int i = 2; i < n; i++) {
				sum[i] = Math.max(Math.max(sum[i - 1], sum[i - 2] + arr[i]), sum[i - 1] - arr[i - 1] + arr[i]);
			}
			if (n != 0) {
				System.out.println("Case " + j + ": " + sum[n - 1]);
			} else {
				System.out.println("Case " + j + ": " + "0");
			}
 
		}
	}
}
