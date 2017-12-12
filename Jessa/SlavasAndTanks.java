import java.util.Scanner;
public class SlavasAndTanks
{
	public static void main (String[]args )
	{
		Scanner s = new Scanner(System.in);

		int n;
		n = s.nextInt();

		if (n % 2 == 0)
		{
			System.out.print(n / 2 * 3);
			System.out.print("\n");

			for (int i = 1; i != n + 1; i += 2)
			{
				System.out.print(i);
				System.out.print(" ");
			}

			for (int i = 2; i != n + 2; i += 2)
			{
				System.out.print(i);
				System.out.print(" ");
			}

			for (int i = 1; i != n + 1; i += 2)
			{
				System.out.print(i);
				System.out.print(" ");
			}

			System.out.print("\n");
		}
		else
		{
			System.out.print((n + 1) / 2 + n / 2 * 2);
			System.out.print("\n");

			for (int i = 2; i != n + 1; i += 2)
			{
				System.out.print(i);
				System.out.print(" ");
			}

			for (int i = 1; i != n + 2; i += 2)
			{
				System.out.print(i);
				System.out.print(" ");
			}

			for (int i = 2; i != n + 1; i += 2)
			{
				System.out.print(i);
				System.out.print(" ");
			}

			System.out.print("\n");
		}
	}
}