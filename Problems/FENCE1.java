import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) throws IOException {
		Scanner sc = new Scanner(System.in);
		double l;
		l = sc.nextDouble();
		while (l != 0) {
			double ans = (l * l) / (2 * 3.1415926);
			System.out.printf("%.2f\n", ans);
			l = sc.nextDouble();
		}
	}
}
