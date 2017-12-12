import java.util.Scanner;
import java.util.StringTokenizer;

public class NikitaAndString{
	public static Scanner sc = new Scanner(System.in);
	public static StringTokenizer st;
	public static void main(String[] args) {
		String non_beaut = getLine();
		// Three DPS namely 1,2,3
		int[][] dp = new int[non_beaut.length()+1][3];
		dp[0][0] = 0;
		dp[0][1]= 0;
		dp[0][2] = 0;
		for (int index = 0;index  < non_beaut.length();index++){
			if(non_beaut.charAt(index) == 'a'){
				dp[index +1][0] = dp[index][0] + 1;
				dp[index+1][1] = Math.max(dp[index+1][0],dp[index][1]); // Either preserver from previous, or use current.
				dp[index+1][2] = Math.max(Math.max(dp[index][0]+1, dp[index][1]+1),dp[index][2]+1);
			}
			else{
				dp[index+1][0] = dp[index][0];
				dp[index+1][1] = Math.max(dp[index][0]+1, dp[index][1] + 1);
				dp[index+1][2] = Math.max(Math.max(dp[index+1][0], dp[index+1][1]),dp[index][2]);
			}
		}
		System.out.println(Math.max(Math.max(dp[non_beaut.length()][0], dp[non_beaut.length()][1]),dp[non_beaut.length()][2]));
	}
	public static int getInt(){
		if (st != null && st.hasMoreTokens()){
			return Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(sc.nextLine());
		return Integer.parseInt(st.nextToken());
	}
	public static long getLong(){
		if (st != null && st.hasMoreTokens()){
			return Long.parseLong(st.nextToken());
		}
		st = new StringTokenizer(sc.nextLine());
		return Long.parseLong(st.nextToken());
	}
	public static double getDouble(){
		if (st != null && st.hasMoreTokens()){
			return Double.parseDouble(st.nextToken());
		}
		st = new StringTokenizer(sc.nextLine());
		return Double.parseDouble(st.nextToken());
	}
	public static String getString(){
		if(st != null && st.hasMoreTokens()){
			return st.nextToken();
		}
		st = new StringTokenizer(sc.nextLine());
		return st.nextToken();
	}
	public static String getLine(){
		return sc.nextLine();
	}
	public static int[][] readMatrix(int lines,int cols){
		int[][] matrr = new int[lines][cols];
		for (int i = 0;i < lines;i++){
			for(int j = 0;j < cols;j++){
				matrr[i][j] = getInt();
			}
		}
		return matrr;
	}
	public static int[] readArray(int lines){
		int[] ar = new int[lines];		
		for (int i = 0;i<lines;i++) ar[i] =getInt();
		return ar;
	}
	
}