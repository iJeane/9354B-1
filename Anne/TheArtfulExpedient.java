import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Problem869a {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n = sc.nextInt();
		int arr1[] = new int[n];
		int arr2[] = new int[n];
		int arr[] = new int[2 * n];
		for (int i = 0; i < n; i++) {
			arr1[i] = sc.nextInt();
			arr[i] = arr1[i];
		}
		for (int i = 0; i < n; i++) {
			arr2[i] = sc.nextInt();
			arr[n + i] = arr2[i];
		}
		Arrays.sort(arr);
		boolean even = true;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				int x = arr1[i] ^ arr2[j];

				if (binarySearch(arr, 0, 2 * n - 1, x) != -1) {
					even = !even;
				}
			}
		}
		if (even) {
			System.out.println("Karen");
		} else {
			System.out.println("Koyomi");
		}
	}
	static int binarySearch(int arr[], int l, int r, int x) {
		if (r >= l) {
			int mid = l + (r - l) / 2;
			if (arr[mid] == x)
				return mid;
			if (arr[mid] > x)
				return binarySearch(arr, l, mid - 1, x);
			return binarySearch(arr, mid + 1, r, x);
		}


		return -1;
	}
}