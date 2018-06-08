import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		BigInteger extra, Total;
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			Total = sc.nextBigInteger();
			extra = sc.nextBigInteger();
			System.out.println((Total.add(extra)).divide(BigInteger.valueOf(2)));
			System.out.println((Total.subtract(extra)).divide(BigInteger.valueOf(2)));
		}
	}
}
