package com.codeforces;
import java.util.*;
public class TomRiddlesDiary{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		ArrayList<String> list = new ArrayList();
		String string;
		int list = in.nextInt();
		for(int i = 0; i < list; i++){
			string = in.next();
			boolean exist = list.contains(string);
			if (exist == true){
				System.out.println("YES");
			}else if(exist == false)
				System.out.println("NO");
			list.add(string);
		}
	}
}
