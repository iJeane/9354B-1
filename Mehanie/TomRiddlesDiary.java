import java.util.*;
public class TomRiddlesDiary{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		ArrayList<String> list = new ArrayList();
		String s;
		int n = in.nextInt();
		for(int i=0;i<n;i++){
			s = in.next();
			boolean exist = list.contains(s);
			if (exist == true) {
				System.out.println("YES");
			}else if(exist == false)
				System.out.println("NO");
			list.add(s);
		}
	}
}
