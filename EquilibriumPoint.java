package in.Arrays;

public class EquilibriumPoint {

	public static void main(String[] args) {
//		int arr[] = { 3, 4, 8, -9, 20, 6 };
//		int arr[] = { 4, 2, -2 };
//		int arr[] = { 4, 2, 2 };

		int arr[] = { -7, 1, 5, 2, -4, 3, 0 };

		System.out.println(find(arr, arr.length));

	}

	// Naive Approach
	private static boolean find(int[] arr, int n) {

		int ls = 0;

		for (int i = 0; i < n - 1; i++) {

			if (i != 0)
				ls += arr[i - 1];

			int rs = 0;

			for (int j = i + 1; j < n; j++) {
				rs += arr[j];
			}

			if (ls == rs)
				return true;
		}

		return false;
	}

}
