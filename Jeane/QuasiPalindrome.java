package com.codeforces;

import java.util.Scanner;

public class QuasiPalindrome{

	public static void main(String[] args){
		try{
			QuasiPalindrome qp = new QuasiPalindrome();
			qp.Run();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public void Run(){
		Scanner scan = new Scanner(System.in);
		String number = scan.next();
		scan.close();
		String reverse = "";
		String palindrome="";
		
		for(int i = number.length()-1; i >= 0; i--){
			reverse += number.charAt(i);
		}
		
		reverse = Integer.valueOf(reverse).toString();
		
		for(int y = reverse.length()-1; y >= 0; y--){
			palindrome += reverse.charAt(y);
		}
		
		if(palindrome.equals(reverse)){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
	}
}
