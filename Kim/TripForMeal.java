package com.codeforces;
import java.util.Scanner;

public class TripForMeal {
    public static void main(String[] args) {
        Scanner input   = new Scanner(System.in);
        int     num  = input.nextInt();
        int     distanceA    = input.nextInt();
        int     distanceB    = input.nextInt();
        int     distanceC    = input.nextInt();
        int     distance = 0;

          num--;

          if(num-- > 0){
               distance += Math.min(distanceA, distanceB);
          }
          if(distance > 0){
               distance += num * Math.min(Math.min(distanceA, distanceB), distanceC);
          }
          System.out.println(distance);
     }
}



