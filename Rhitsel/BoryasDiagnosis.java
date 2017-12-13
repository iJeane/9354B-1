package com.codeforces;
import java.util.Scanner;

public class Solution{
	public static void main(String[] args){

		Scanner kbd = new Scanner(System.in);

		int n = 0;
			n = kbd.nextInt();

	    int ans; 
		int b; 
		int appointment;
		int	siDay; 
		int diDay;
	        ans = 0;

	    for (int i = 1; i <= n; i++){

	    	siDay = kbd.nextInt();
	    	diDay = kbd.nextInt();
	    	appointment = 0;
	    	b = 0;

	    	while(appointment < 1){
	    		if(siDay + diDay * b > ans){
	    			ans = siDay + diDay * b;
	    			appointment++;
	    		}else{
	    			b++;
	    		}

	    	}

	    }
	    System.out.print(ans);
	}
}