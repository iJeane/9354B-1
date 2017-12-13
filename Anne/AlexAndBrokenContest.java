package com.codeforces;

import java.util.*;
public class AlexAndBrokenContest{

public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String title = sc.nextLine();
		int count = 0;
		boolean matchAny;

		if(title.length() < 3){
			System.out.printf("NO\n");
		}else{
			do{
				matchAny = false;
				if(title.contains("Danil")){
					count = count+1;
					title = title.replaceFirst("Danil","XXXXX");
					matchAny = true;
				}
				if(title.contains("Olya")){
					count = count+1;
					title = title.replaceFirst("Olya","XXXX");
					matchAny = true;
				}
				if(title.contains("Slava")){
					count = count+1;
					title = title.replaceFirst("Slava","XXXXX");
					matchAny = true;
				}
				if(title.contains("Ann")){
					count = count+1;
					title = title.replaceFirst("Ann","XXX");
					matchAny = true;
				}
				if(title.contains("Nikita")){
					count = count+1;
					title = title.replaceFirst("Nikita","XXXXXX");
					matchAny = true;
				}
			}while(matchAny);

			if(count != 1){
				System.out.printf("NO\n");
			}else{
				System.out.printf("YES\n");
			}
		}
		sc.close();
	}
}
