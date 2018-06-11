import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static int solve(int[] arr, int amount) {
		int ans = 0, sum = 0;
		for (int i = arr.length-1; i >= 0; i--) {
			sum += arr[i];
			ans++;
			if (sum >= amount) {
				break;
			}
		}
		if (sum >= amount) {
			return ans;
		} else {
			return -1;
		}
	}

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int n, amount;
		for (int k = 0; k < t; k++) {
			amount = sc.nextInt();
			n = sc.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			Arrays.sort(arr);
			if (solve(arr, amount) == -1) {
				System.out.println("Scenario " + "#" + (k + 1) + ":");
				System.out.println("impossible");
			} else {
				System.out.println("Scenario " + "#" + (k + 1) + ":");
				System.out.println(solve(arr, amount));
			}
			System.out.println();
		}
	}
}
