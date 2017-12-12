import java.util.Scanner;

public class KRounding {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
	    long a, b;
		input1 = s.nextLong();
		input2 = s.nextLong();
		
		for(long i = 0; i < input2; i++){
			if(input1%2 == 0){
			    input1 /= 2;
			}
			if (input1%5 == 0){
		        input1 /= 5;
			}
		}
		System.out.print((int)a);
		for(long i = 0; i < input2; i++){
			System.out.print("0");
		}
	}
}
