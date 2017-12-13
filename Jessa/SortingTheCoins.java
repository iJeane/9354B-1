import java.util.*;
import java.io.*;

public class ProblemD
{

    static int mod = (int) (1e9+7);
    static InputReader in;
    static PrintWriter out;

    static int[] rt = new int[300001];
    static int[] size = new int[300001];
            
    static void initialize(){
        for(int i=0;i<rt.length;i++){
            rt[i] = i;
            size[i] = 0;
        }
    }
    
    static int root(int x){
        while(rt[x]!=x){
            rt[x] = rt[rt[x]];
            x = rt[x];
        }
        return x;
    }
    
    static boolean union(int x,int y){
        int root_x = root(x);
        int root_y = root(y);
        if(root_x==root_y) return true;
        
        if(size[root_x]<size[root_y]){
            rt[root_x] = rt[root_y];
            size[root_y] += size[root_x];
        }
        else{
            rt[root_y] = rt[root_x];
            size[root_x] += size[root_y];            
        }
        return false;
    }
    
    public static void main(String[] args)
    {
        in = new InputReader(System.in);
        out = new PrintWriter(System.out);            

        int n = in.nextInt();
        
        initialize();
        int ans = 1;
        out.print(ans + " ");

        for(int i = 1; i <= n; i++){
            int p = in.nextInt();
            size[p]++;
            if(p == n){
                int rprevp = root(p - 1);
                ans -= size[rprevp];
                if(size[rprevp] > 0)
                    union(rprevp, p);
            }
            else{
                int rnextp = root(p + 1);
                int rprevp = root(p - 1);
                int rn = root(n);
                //debug(p,rnextp,rprevp);
                if(rnextp == rn){
                    if(size[rnextp] > 0)
                        ans -= size[rprevp];
                    else
                        ans ++;
                }
                else{
                    ans ++;
                }
                if(size[rnextp] > 0)
                    union(rnextp, p);
                if(size[rprevp] > 0)
                    union(rprevp, p);
            }
            out.print(ans + " ");
        }
        
        out.println();
        
        out.close();

    }


    static void debug(Object... o)
    {
            System.out.println(Arrays.deepToString(o));
    }

    static class Pair implements Comparable<Pair>
    {

        int x,y;
        
        
        Pair (int x,int y)
        {
		this.x = x;
                this.y = y;
	}
        
	public int compareTo(Pair o)
        {
            return Integer.compare(this.x,o.x);
		//return 0;
	}

        public boolean equals(Object o)
        {
            if (o instanceof Pair)
            {
                Pair p = (Pair)o;
                return p.x == x && p.y==y;
            }
            return false;
        }

        @Override
        public String toString()
        {
            return x + " "+ y;
        }
        
        public int hashCode()
        {
            return new Long(x).hashCode() * 31 + new Long(y).hashCode();
        }
    
    } 

    static long gcd(long x,long y)
    {
        if(y==0)
                return x;
        else
                return gcd(y,x%y);
    }

    static int gcd(int x,int y)
    {
        if(y==0)
                return x;
        else 
                return gcd(y,x%y);
    }

    static long pow(long n,long p,long m)
    {
         long  result = 1;
          if(p==0)
            return 1;

        while(p!=0)
        {
            if(p%2==1)
                result *= n;
            if(result>=m)
            result%=m;
            p >>=1;
            n*=n;
            if(n>=m)
            n%=m;
        }
        return result;
    }

    static long pow(long n,long p)
    {
        long  result = 1;
          if(p==0)
            return 1;

        while(p!=0)
        {
            if(p%2==1)
                result *= n;	    
            p >>=1;
            n*=n;	    
        }
        return result;
    }

    static class InputReader
    {

        private final InputStream stream;
        private final byte[] buf = new byte[8192];
        private int curChar, snumChars;
        private SpaceCharFilter filter;

        public InputReader(InputStream stream)
        {
                this.stream = stream;
        }

        public int snext()
        {
                if (snumChars == -1)
                        throw new InputMismatchException();
                if (curChar >= snumChars)
                {
                        curChar = 0;
                        try
                        {
                                snumChars = stream.read(buf);
                        } catch (IOException e)
                        {
                                throw new InputMismatchException();
                        }
                        if (snumChars <= 0)
                                return -1;
                }
                return buf[curChar++];
        }

        public int nextInt()
        {
                int c = snext();
                while (isSpaceChar(c))
                {
                        c = snext();
                }
                int sgn = 1;
                if (c == '-')
                {
                        sgn = -1;
                        c = snext();
                }
                int res = 0;
                do
                {
                        if (c < '0' || c > '9')
                                throw new InputMismatchException();
                        res *= 10;
                        res += c - '0';
                        c = snext();
                } while (!isSpaceChar(c));
                return res * sgn;
        }

        public long nextLong()
        {
                int c = snext();
                while (isSpaceChar(c))
                {
                        c = snext();
                }
                int sgn = 1;
                if (c == '-')
                {
                        sgn = -1;
                        c = snext();
                }
                long res = 0;
                do
                {
                        if (c < '0' || c > '9')
                                throw new InputMismatchException();
                        res *= 10;
                        res += c - '0';
                        c = snext();
                } while (!isSpaceChar(c));
                return res * sgn;
        }

        public int[] nextIntArray(int n)
        {
                int a[] = new int[n];
                for (int i = 0; i < n; i++)
                {
                        a[i] = nextInt();
                }
                return a;
        }

        public long[] nextLongArray(int n)
        {
                long a[] = new long[n];
                for (int i = 0; i < n; i++)
                {
                        a[i] = nextLong();
                }
                return a;
        }

        public String readString()
        {
                int c = snext();
                while (isSpaceChar(c))
                {
                        c = snext();
                }
                StringBuilder res = new StringBuilder();
                do
                {
                        res.appendCodePoint(c);
                        c = snext();
                } while (!isSpaceChar(c));
                return res.toString();
        }

        public String nextLine()
        {
                int c = snext();
                while (isSpaceChar(c))
                        c = snext();
                StringBuilder res = new StringBuilder();
                do
                {
                        res.appendCodePoint(c);
                        c = snext();
                } while (!isEndOfLine(c));
                return res.toString();
        }

        public boolean isSpaceChar(int c)
        {
                if (filter != null)
                        return filter.isSpaceChar(c);
                return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        private boolean isEndOfLine(int c)
        {
                return c == '\n' || c == '\r' || c == -1;
        }

        public interface SpaceCharFilter
        {
                public boolean isSpaceChar(int ch);
        }

    }
}    