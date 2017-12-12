import java.io.*;
import java.util.*;
import java.math.*;
import java.util.concurrent.*;

public final class Fire436
{
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	static FastScanner sc=new FastScanner(br);
    static PrintWriter out=new PrintWriter(System.out);
	static Random rnd=new Random();
	static int[] pre,pre_idx;
	static int maxn=(int)(2005);
	
    public static void main(String args[]) throws Exception
    {
		int n=sc.nextInt();Node[] a=new Node[n];
		
		for(int i=0;i<n;i++)
		{
			a[i]=new Node(i,sc.nextInt(),sc.nextInt(),sc.nextInt());
		}
		
		Arrays.sort(a);boolean ans=false;
		
		for(int i=0;i<n;i++)
		{
			if(a[i].ti<a[i].di)
			{
				ans=true;
			}
		}
		
		if(false)
		{
			
		}
		
		else
		{
			pre=new int[maxn];pre_idx=new int[maxn];
			
			for(int i=0;i<maxn;i++)
			{
				pre[i]=0;pre_idx[i]=-1;
			}
			
			int[][] dp=new int[n][maxn];int[][] prev=new int[n][maxn];
			
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<maxn;j++)
				{
					if(j+a[i].ti<a[i].di)
					{
						dp[i][j+a[i].ti]=pre[j]+a[i].pi;
						
						prev[i][j+a[i].ti]=pre_idx[j];
					}
				}
				
				for(int j=0;j<maxn;j++)
				{
					if(dp[i][j]>pre[j])
					{
						pre[j]=dp[i][j];pre_idx[j]=i;
					}
					
					if(j>0 && pre[j-1]>pre[j])
					{
						pre[j]=pre[j-1];pre_idx[j]=pre_idx[j-1];
					}
				}
			}
			
			int max=0,idx1=-1,idx2=-1;
			
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<maxn;j++)
				{
					if(dp[i][j]>max)
					{
						max=dp[i][j];idx1=i;idx2=j;
					}
				}
			}
			
			System.out.println(max);List<Integer> list=new ArrayList<Integer>();
			
			while(idx1!=-1 && idx2!=-1)
			{
				list.add(a[idx1].idx);
				
				if(prev[idx1][idx2]==-1)
				{
					break;
				}
				
				int xx=prev[idx1][idx2],yy=-1,curr=0;
				
				for(int j=0;j<=idx2-a[idx1].ti;j++)
				{
					if(dp[xx][j]>curr)
					{
						curr=dp[xx][j];yy=j;
					}
				}
				
				idx1=xx;idx2=yy;
			}
			
			Collections.reverse(list);out.println(list.size());
			
			for(int x:list)
			{
				out.print((x+1)+" ");
			}
			
			out.println("");
		}
		
		out.close();
    }
	
	private static class Node implements Comparable<Node>
	{
		int idx,ti,di,pi;

		public Node(int idx,int ti,int di,int pi)
		{
			this.idx=idx;this.ti=ti;this.di=di;this.pi=pi;
		}

		public int compareTo(Node x)
		{
			if(this.di==x.di)
			{
				return -(Integer.compare(this.pi,x.pi));
			}
			
			return Integer.compare(this.di,x.di);
		}
	}
	
}
class FastScanner
{
    BufferedReader in;
    StringTokenizer st;

    public FastScanner(BufferedReader in) {
        this.in = in;
    }
	
    public String nextToken() throws Exception {
        while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(in.readLine());
        }
        return st.nextToken();
    }
	
	public String next() throws Exception {
		return nextToken().toString();
	}
	
    public int nextInt() throws Exception {
        return Integer.parseInt(nextToken());
    }

    public long nextLong() throws Exception {
        return Long.parseLong(nextToken());
    }

    public double nextDouble() throws Exception {
        return Double.parseDouble(nextToken());
    }
}