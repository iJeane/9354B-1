import java.util.*;
	public class MaximBuysAnApartment {   
		public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);
		    int n = sc.nextInt(); 
		    int k = sc.nextInt();
		    int min;
		    int max;
		    
		    if ((n == 0 || k == 0) || n == k ) {
		        System.out.print(0+ " " + 0);
		        return;
		    }
		    if ((n-k)/k >=2) {
		    	max = k*2;
		    }else max = (n-k);
		    	System.out.print(Math.min(n-k, 1)+" "+ max);
		}
	}