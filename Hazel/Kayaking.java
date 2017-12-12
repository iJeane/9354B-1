import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Kayaking {

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	int n = input.nextInt();
	int[] weight = new int[100];
	for (int i = 0; i < 2 * n; i++)
	    weight[i] = input.nextInt();
	input.close();
	Arrays.sort(weight, 0, 2 * n);
	int sum, answer = Integer.MAX_VALUE;
	for (int i = 0; i < 2 * n; i++) {
	    for (int j = i + 1; j < 2 * n; j++) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int index = 0; index < 2 * n; index++)
		    if (index != i && index != j)
			list.add(weight[index]);

		sum = 0;
		for (int index = 0; index < list.size() / 2; index++)
		    sum += (list.get(index * 2 + 1) - list.get(index * 2));

		answer = Math.min(answer, sum);
	    }
	}
	System.out.println(answer);
    }
}