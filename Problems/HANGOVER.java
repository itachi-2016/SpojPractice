import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n, sum = 0;
		n = sc.nextDouble();
		while (n != 0.00) {
			int ans = 1;
			sum = 0;
			while (n >= sum) {
				sum += (1 / ((ans + 1) * 1.0));
				ans++;
			}
			System.out.println(ans-1+" "+"card(s)");
			n = sc.nextDouble();
		}
	}
}
