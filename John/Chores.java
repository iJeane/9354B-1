package com.codeforces;

import java.util.Scanner;

public class Chores{

    public static void Main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numOfChores = sc.nextInt();
        int maxNumOfChores = sc.nextInt();
        int unitOfTime = sc.nextInt();
        int total = 0;

        for(int i = 0; i < numOfChores; i++){

            if(i >= numOfChores - maxNumOfChores){
                total += unitOfTime;
            }else{
                total += sc.nextInt();
            }

        }

        System.out.println(total);
    }

}