import java.util.Scanner;
public class Bus {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int f = input.nextInt();
		int k = input.nextInt();
		int s = b;
		s = s-f;
		f = a-f;
		int ans=0;
		for(int i=1; i<k;i++){
			if(s<0){
				System.out.println("-1");
				return;
			}
			if(2*f>s){
				s=b;
				ans++;
			}
			s-=2*f;
			f = a-f;
		}
		if(s<0){
			System.out.println("-1");
			return;
		}
		
		if(f>s){
			s=b;
			ans++;
		}
		s-=f;
		if(s<0){
			ans=-1;
		}
		System.out.println(ans);
	}
}