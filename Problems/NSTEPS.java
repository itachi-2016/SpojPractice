import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T, x, y;
		T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			x = sc.nextInt();
			y = sc.nextInt();
			if (x - y == 0 || x - y == 2) {
				if (x % 2 == 0) {
					System.out.println(x + y);
				} else {
					System.out.println(x + y - 1);
				}
			} else {
				System.out.println("No Number");
			}
		}
	}
}
