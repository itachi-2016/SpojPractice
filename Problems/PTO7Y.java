import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Stack;
//Program may seem length but the Reader class is only used for faster Input/Output.
//This led my answer to pass all the test cases.
public class Main {
	public Stack<Integer> s;
	public static LinkedList<Integer> adj[];
	public static int n;

	Main(int net, boolean[] vis) {
		adj = new LinkedList[net + 1];
		for (int i = 0; i < net + 1; i++) {
			adj[i] = new LinkedList<>();
			vis[i] = false;
		}
	}

	static void addEdge(int x, int y) {
		adj[x].push(y);
	}

	static void dfs(boolean[] vis, int k) {
		vis[k] = true;
		while (!adj[k].isEmpty()) {
			int query = adj[k].poll();
			if (!vis[query]) {
				dfs(vis, query);
			}
		}
	}

	static class Reader {
		final private int BUFFER_SIZE = 1 << 16;
		private DataInputStream din;
		private byte[] buffer;
		private int bufferPointer, bytesRead;

		public Reader() {
			din = new DataInputStream(System.in);
			buffer = new byte[BUFFER_SIZE];
			bufferPointer = bytesRead = 0;
		}

		public Reader(String file_name) throws IOException {
			din = new DataInputStream(new FileInputStream(file_name));
			buffer = new byte[BUFFER_SIZE];
			bufferPointer = bytesRead = 0;
		}

		public String readLine() throws IOException {
			byte[] buf = new byte[64]; // line length
			int cnt = 0, c;
			while ((c = read()) != -1) {
				if (c == '\n') {
					break;
				}
				buf[cnt++] = (byte) c;
			}
			return new String(buf, 0, cnt);
		}

		public int nextInt() throws IOException {
			int ret = 0;
			byte c = read();
			while (c <= ' ') {
				c = read();
			}
			boolean neg = (c == '-');
			if (neg) {
				c = read();
			}
			do {
				ret = ret * 10 + c - '0';
			} while ((c = read()) >= '0' && c <= '9');

			if (neg) {
				return -ret;
			}
			return ret;
		}

		public long nextLong() throws IOException {
			long ret = 0;
			byte c = read();
			while (c <= ' ') {
				c = read();
			}
			boolean neg = (c == '-');
			if (neg) {
				c = read();
			}
			do {
				ret = ret * 10 + c - '0';
			} while ((c = read()) >= '0' && c <= '9');
			if (neg) {
				return -ret;
			}
			return ret;
		}

		public double nextDouble() throws IOException {
			double ret = 0, div = 1;
			byte c = read();
			while (c <= ' ') {
				c = read();
			}
			boolean neg = (c == '-');
			if (neg) {
				c = read();
			}

			do {
				ret = ret * 10 + c - '0';
			} while ((c = read()) >= '0' && c <= '9');

			if (c == '.') {
				while ((c = read()) >= '0' && c <= '9') {
					ret += (c - '0') / (div *= 10);
				}
			}

			if (neg) {
				return -ret;
			}
			return ret;
		}

		private void fillBuffer() throws IOException {
			bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
			if (bytesRead == -1) {
				buffer[0] = -1;
			}
		}

		private byte read() throws IOException {
			if (bufferPointer == bytesRead) {
				fillBuffer();
			}
			return buffer[bufferPointer++];
		}

		public void close() throws IOException {
			if (din == null) {
				return;
			}
			din.close();
		}
	}

	public static void main(String args[]) throws IOException {
		int m;
		Reader sc = new Reader();
		n = sc.nextInt();
		m = sc.nextInt();
		int x, y;
		boolean ans = true;
		boolean vis[] = new boolean[100005];
		Main graph = new Main(n, vis);
		for (int i = 0; i < m; i++) {
			x = sc.nextInt();
			y = sc.nextInt();
			addEdge(x, y);
		}
		if (n - 1 != m) {
			System.out.println("NO");
		} else {
			dfs(vis, 1);
			for (int i = 2; i <= n; i++) {
				if (vis[i] == false) {
					ans = false;
					break;
				}
			}
			if (ans == true && n - 1 == m) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
}
