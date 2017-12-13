package com.codeforces;

import java.util.Scanner;

public class ArpaAndAResearchInMexiacanWave{

    public static void Main(String[] args){
        Scanner input = new Scanner(System.in);
        int numOfSpectators = input.nextInt();
        int standingSpectators = input.nextInt();
        int time = input.nextInt();
        int standing = 0;

        if(time < standingSpectators){
        	standing = time;
        }else if(time > numOfSpectators){
        	standing = standingSpectators - (time - numOfSpectators);
        }else 
        	standing = standingSpectators;
        }

        System.out.println(standing);

    }

}