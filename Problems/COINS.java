import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static long solve(long a) {
		if (a < 12) {
			return a;
		} else {
			return Math.max(a, solve(a / 2) + solve(a / 3) + solve(a / 4));
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String n;
		n = br.readLine();
		while (n != null) {
			long a = Long.parseLong(n);
			System.out.println(solve(a));
			n = br.readLine();
		}
	}
}
