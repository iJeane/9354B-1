package com.codeforces;

import java.util.Scanner;

public class ClassroomWatch{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int inputA = input.nextInt();
		int number = 0;
		int[] array = new int[90];
		int number1 = number;
		for(int i = 1; i <= 81; i++) {

			int x = inputA - i;
			int sum = 0;

			while(x > 0) {

				sum += x % 10;
				x /= 10;
			}

			if(sum == i) {

				array[number1++] = inputA - i;
			}
		}

		number = number1;

		System.out.println(number);

		for(int i = number - 1; i >= 0; i--) {

			System.out.println(array[i]);
		}
	}
}
