import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		String s;
		while (1 > 0) {
			n = sc.nextInt();
			if (n == 0) {
				break;
			}
			s = sc.next();
			int m = s.length() / n;
			String[] arr = new String[m];
			int i = 0, j = 0;
			while (i < s.length()) {
				StringBuilder sb = new StringBuilder(s.substring(i, i + n));
				if (j % 2 != 0) {
					sb = sb.reverse();
				}
				arr[j] = sb.toString();
				j++;
				i += n;
			}
			for (i = 0; i < n; i++) {
				for (j = 0; j < m; j++) {
					System.out.print(arr[j].charAt(i));
				}
			}
			System.out.println();
		}
	}
} 
