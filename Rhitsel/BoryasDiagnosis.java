import java.util.Scanner;

public class Solution{
	public static void main(String[] args){

		Scanner kbd = new Scanner(System.in);

		int n = 0;
			n = kbd.nextInt();

	    int ans, b, appoint, siDay, diDay;
	        ans = 0;

	    for (int i = 1; i <= n; i++){

	    	siDay = kbd.nextInt();
	    	diDay = kbd.nextInt();
	    	appoint = 0;
	    	b = 0;

	    	while(appoint < 1){
	    		if(siDay + diDay * b > ans){
	    			ans = siDay + diDay * b;
	    			appoint++;
	    		}else{
	    			b++;
	    		}

	    	}

	    }
	    System.out.print(ans);
	}
}