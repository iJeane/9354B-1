package com.codeforces;
import java.util.*;
public class PrettyIntegers {
	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		
		int n = kbd.nextInt();
		int m = kbd.nextInt();
		int min1 = 10;
		int min2 = 10;
		int min3 = 10;
		boolean[] k = new boolean[10];
		for(int i = 0; i < n; i++) {
			int v = kbd.nextInt();
			if(v < min1) {
				min1 = v;
			}
			k[v] = true;
		}
		
		for(int i = 0; i < m; i++) {
			int v = kbd.nextInt();
			if(v < min2) {
				min2 = v;
			}
			if(k[v]) {
				if(v < min3) {
					min3 = v;
				}
			}
		}
		
		if(min1 == min2) {
			System.out.println(min1);
		} else if (min1 == 0 || min2 == 0) {
			System.out.println(Math.max(min1, min2));
		} else if(min3 < 10) {
			System.out.println(min3);
		}else if(min1 < min2) {
		
			System.out.print(min1);
			System.out.println(min2);
		} else {
			System.out.print(min2);
			System.out.println(min1);
		}
	}
}