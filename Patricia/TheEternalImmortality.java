/**
 *
 *
 *@author Patrishia Lansangan
 *@version 8.0
 *@since 2017-11-28
 */

import java.util.Scanner;

public class Eternal869B {
    public static void main(String[] args) {

       long a;
       long b;
       long result = 1;
       Scanner sc = new Scanner(System.in);
       herbs = sc.nextLong();
       incense = sc.nextLong();
       long count = incense - herbs;

       if (herbs == 0){
		   herbs = 1;
       }

       for (int i = 0; i < count; i++){
	       if (result == 0){
	           break;
	       }
	       result *= (incense%10);
	       result %= 10;
	       incense--;
       }
       System.out.print(result%10);
       sc.close();
    }
}
