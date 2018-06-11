import java.io.IOException;
import java.util.Scanner;

public class Main {
	static int[] arr = new int[1001];

	static int sq_sum(int n) {
		int ans = 0;
		while (n > 0) {
			ans += (n % 10) * (n % 10);
			n /= 10;
		}
		return ans;
	}

	static int solve(int n) {
		int sum = sq_sum(n);
		int count = 1;
		while (sum != 1) {
			if (arr[sum] == 0) {
				arr[sum]++;
				sum = sq_sum(sum);
				count++;
			} else {
				count = -1;
				break;
			}
		}
		return count;
	}

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		if(t!=1)
		System.out.println(solve(t));
		else
		System.out.println(0);
	}
}
