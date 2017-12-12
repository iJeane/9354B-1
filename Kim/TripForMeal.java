
/**
 * This program displays an
 * output with one number — minimum distance in meters Winnie must go through to have a meal n times.
 *
 * @author Kim Willy
 * @version 8.0
 * @since 2017-11-29
 */


import java.util.Scanner;

public class TripForMeal {
     public static void main(String[] args) {
          Scanner sc   = new Scanner(System.in);
          int     num  = sc.nextInt();
          int     a    = sc.nextInt();
          int     b    = sc.nextInt();
          int     c    = sc.nextInt();

          int     dist = 0;

          num--;

          if (num-- > 0) {
               dist += Math.min(a, b);
          }

          if (dist > 0) {
               dist += num * Math.min(Math.min(a, b), c);
          }

          System.out.println(dist);

     }
}



