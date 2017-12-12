import java.util.*;
public class PolycarpAndLetters {
	public static void main(String args[]){
		Scanner kd=new Scanner(System.in);
		int a=kd.nextInt();
		String s=kd.next();
		int answer=0;
		int number[]=new int[27];
		int i=0;
		do{
			if(s.charAt(i)<97){
				number=new int[27];
			}
			else{
				if(number[s.charAt(i)-96]==0){
					number[s.charAt(i)-96]=1;
					number[0]++;
					if(number[0]>answer){
						answer=number[0];
					}
				}
			}
			i++;
		}while(i<a);
		System.out.println(answer);

	}

}