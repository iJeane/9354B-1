import java.io.*;
import java.util.*;

public class BalancedSubstring {
    static int n , sum , max;
    static String s;
    static int[] first;
    static int[] offset;
    public static void main(String[] args) throws IOException {
        FastScanner in = new FastScanner(System.in);
        n = in.nextInt();
        s = in.next();
        offset = new int[n+1];
        first = new int[2*n+1];
        Arrays.fill(first , -1);
        first[n] = 0;
        sum = n;
        max = 0;
        for(int i = 1; i <= n; i++){
            if(s.charAt(i-1) == '0'){
                sum++;
            }
            else{
                sum--;
            }
            offset[i] = sum;
            if(first[offset[i]] == -1){
                first[offset[i]] = i;
            }
            max = Math.max(max , i - first[offset[i]]);
        }
        System.out.println(max);
    }

    private static class FastScanner {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;

        public FastScanner(InputStream stream) {
            this.stream = stream;
        }

        int read() {
            if (numChars == -1)
                throw new InputMismatchException();
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (numChars <= 0) return -1;
            }
            return buf[curChar++];
        }

        boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        boolean isEndline(int c) {
            return c == '\n' || c == '\r' || c == -1;
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }

        public String next() {
            int c = read();
            while (isSpaceChar(c)) c = read();
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = read();
            } while (!isSpaceChar(c));
            return res.toString();
        }

        public String nextLine() {
            int c = read();
            while (isEndline(c))
                c = read();
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = read();
            } while (!isEndline(c));
            return res.toString();
        }
    }
}