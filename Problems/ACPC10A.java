import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		while (1 > 0) {
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
			if (a == b && b == c && a == 0) {
				break;
			}
			if (b * b == a * c) {
				System.out.println("GP " + (b * c) / a);
			}
			if (b - a == c - b) {
				System.out.println("AP " + (2 * c - b));
			}
		}
	}
}
