package com.codeforces;

import java.util.Scanner;

public class BetweenTheOffices{

	public static void main(String[] args){
		try{
			BetweenTheOffices bto = new BetweenTheOffices();
			bto.Run();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public void Run(){
		Scanner scan = new Scanner(System.in);
		int strNum = scan.nextInt();
		String str = scan.next();
		str = str.toUpperCase();
		scan.close();
		
		if(strNum == str.length()){
			int seattle=0
			int francisco=0;
			for(int i = 1; i < str.length(); i++){
				if(str.charAt(i-1) != str.charAt(i)){
					if(str.charAt(i-1) == 'F'){
						seattle++;
					}else{
						francisco++;
					}
				}	
			}
			
			if(francisco > seattle){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
			
		}else{
			System.exit(0);
		}	
	}
}
