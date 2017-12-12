package com.codeforces;

import java.util.Scanner;

public class ADeclinedFinalists{

	public static void main(String[] args){
		try{
			ADeclinedFinalists adf = new ADeclinedFinalists();
			adf.Run();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public void Run(){
		Scanner scan = new Scanner(System.in);
		int k; 
		int r;
		int max=0;
		k = scan.nextInt();
		for(int i = 0; i < k; i++){
			r = scan.nextInt();
			if(r > max){
				max = r;
			}
		}
		scan.close();
		if(max >= 26){
			System.out.println(max-25);
		}else{
			System.out.println("0");
		}
	}
}