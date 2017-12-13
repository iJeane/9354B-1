package com.codeforces;
import java.util.*;
public class Bus {
	public static void Main(String[] args) {
		Scanner input = new Scanner(System.in);
		int targetPoint = input.nextInt();
		int litersGas = input.nextInt();
		int gasStation = input.nextInt();
		int numberOfJourneys = input.nextInt();
		int startingPoint = litersGas;
		startingPoint = startingPoint - gasStation;
		gasStation = targetPoint - gasStation;
		int answer = 0;
		for(int i = 1; i < numberOfJourneys; i++){
			if(startingPoint < 0){
				System.out.println("-1");
				return;
			}
			if(2 * gasStation > startingPoint){
				startingPoint = litersGas;
				answer++;
			}
			startingPoint -= 2*gasStation;
			gasStation = targetPoint-gasStation;
		}
		if(startingPoint < 0){
			System.out.println("-1");
			return;
		}
		
		if(gasStation > startingPoint){
			startingPoint=litersGas;
			answer++;
		}
		startingPoint -= gasStation;
		if(startingPoint < 0){
			answer =- 1;
		}
		System.out.println(answer);
	}
}