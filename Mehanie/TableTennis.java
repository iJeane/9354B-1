package com.codeforces;
import java.util.Scanner;
	public static void main(String[] args){
		Scanner scan= new Scanner(System.in);
		int people = scan.nextInt();
		long wins = scan.nextInt();
		int power1 = scan.nextInt();
		long power2 = 0;
		
		for(int x = 1; x < people; x++){
			int c = scan.nextInt();
			if(c > power1){
				power2 =1;
				power1 = c;
			}else{
				power2++;
			}
			if (power2 >= wins){
				break;
			}
		}
		System.out.print(power1);
	}
}