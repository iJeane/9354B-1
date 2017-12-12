import java.util.*;
import java.io.*;

public class ProductTransformation {
	
	int c;

	long prod(long a, long b, long c) {
		long x = 1 % c;
		while (b > 0) {
			if ((b & 1) == 1) {
				x = x * a % c;
			}
			a = a * a % c;
			b >>>= 1;
		}
		return x;
	}
	
	long inv(long a, long c) {
		return prod(a, c - 2, c);
	}
	
	void solve() {
		int n = in.nextInt(), m = in.nextInt();
		long a = in.nextInt(), q = in.nextInt();
		a %= q;
		
		c = 1;
		long cur = a;
		while (cur != 1) {
			c++;
			cur = cur * a % q;
		}
		
		long[] choose = new long[n];
		choose[0] = 1 % c;
		for (int i = 1; i < n && i <= m; i++) {
			choose[i] = choose[i - 1] * (m - i + 1) % c;
			choose[i] = choose[i] * inv(i, c) % c;
		}
		
		for (int i = 1; i < n; i++) {
			choose[i] += choose[i - 1];
			choose[i] %= c;
		}
		for (int i = n - 1; i >= 0; i--) {
			out.print(prod(a, choose[i], q) + " ");
		}
		out.println();
	}

	FastScanner in;
	PrintWriter out;

	void run() {
		in = new FastScanner();
		out = new PrintWriter(System.out);
		solve();
		out.close();
	}

	class FastScanner {
		BufferedReader br;
		StringTokenizer st;

		public FastScanner() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		public FastScanner(String s) {
			try {
				br = new BufferedReader(new FileReader(s));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		public String nextToken() {
			while (st == null || !st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
				}
			}
			return st.nextToken();
		}

		public int nextInt() {
			return Integer.parseInt(nextToken());
		}

		public long nextLong() {
			return Long.parseLong(nextToken());
		}

		public double nextDouble() {
			return Double.parseDouble(nextToken());
		}
	}

	public static void main(String[] args) {
		new ProductTransformation().run();
	}
}