import java.util.Scanner;
public class TableTennis{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		long j = sc.nextInt();
		int b = sc.nextInt();
		long k = 0;
		
		for(int x = 1; x < a; x++) {
			int c = sc.nextInt();
			if (c>b) {
				k =1;
				b = c;
			}else {
				k++;
			}
			if (k >= j) {
				break;
			}
		}
		System.out.print(b);
	}
}