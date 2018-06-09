import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n;
		n = sc.nextLong();
		long prod = 2;
		boolean ans = false;
		for (int i = 0; i < 63; i++) {
			if (prod == n) {
				ans = true;
				break;
			}
			prod *= 2;
		}
		if (ans) {
			System.out.println("TAK");
		} else {
			System.out.println("NIE");
		}
	}
}
