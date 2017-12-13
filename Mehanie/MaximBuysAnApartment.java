package com.codeforces;
import java.util.*;
	public class MaximBuysAnApartment{   
		public static void main(String[] args){
		    Scanner sc = new Scanner(System.in);
		    int numOfApartment = sc.nextInt(); 
		    int inhabited = sc.nextInt();
		    int min;
		    int max;
		    
		    if((numOfApartment == 0 || inhabited == 0) || numOfApartment == inhabited ){
		        System.out.print(0+ " " + 0);
		        return;
		    }
		    if((numOfApartment-inhabited)/inhabited >= 2){
		    	max = inhabited*2;
		    }else max = (numOfApartment-inhabited);
		    	System.out.print(Math.min(numOfApartment-inhabited, 1)+" "+ max);
		}
	}