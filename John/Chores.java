package com.codeforces;

import java.util.Scanner;

public class Chores {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int x = sc.nextInt();
        int total = 0;

        for(int i = 0; i < n; i++) {

            if(i >= n - k) {
                total += x;
            } else {
                total += sc.nextInt();
            }

        }

        System.out.println(total);
    }

}