package com.codeforces;

import java.util.*;

public class Fraction {
     static int gcd(int valueA, int valueB) {
          if (valueB == 0) {
               return valueA;
          } else {
               return gcd(valueB, valueA % valueB);
          }
     }

     public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
          int     number = input.nextInt();

          for (int i = number / 2; i > 0; i--) {
               if (gcd(i, number - i) == 1) {
                    System.out.println(i + " " + (number - i));

                    break;
               }
          }
     }
}



