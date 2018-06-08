import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, sum, ans;
		while (1 > 0) {
			n = sc.nextInt();
			if (n == -1) {
				break;
			}
			int[] arr = new int[n];
			sum = 0;
			ans = 0;
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
				sum += arr[i];
			}
			if (sum % n == 0) {
				sum /= n;
				for (int i = 0; i < n; i++) {
					if (arr[i] > sum) {
						ans += (arr[i] - sum);
					}
				}
				System.out.println(ans);
			} else {
				System.out.println(-1);
			}
		}
	}
}
