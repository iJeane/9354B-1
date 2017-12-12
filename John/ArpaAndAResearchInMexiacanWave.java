package com.codeforces;

import java.util.Scanner;

public class ArpaAndAResearchInMexiacanWave {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        int t = input.nextInt();
        int standing = 0;

        if(t < k) {
        	standing = t;
        } else if(t > n) {
        	standing = k - (t - n);
        } else {
        	standing = k;
        }

        System.out.println(standing);

    }

}