package in.Arrays;

public class EquilibriumPoint {

	public static void main(String[] args) {
//		int arr[] = { 3, 4, 8, -9, 20, 6 }; 
//		int arr[] = { 4, 2, -2 }; 
//		int arr[] = { 4, 2, 2 };

		int arr[] = { 1, 3, 5, 2, 2 };
//		[1, 4, 9, 11, 13]  [13, 12, 9, 4, 2]

//		int arr[] = { -7, 1, 5, 2, -4, 3, 0 };

		System.out.println(find(arr, arr.length));

		System.out.println(findEfficient(arr, arr.length));

	}

	private static boolean findEfficient(int[] arr, int n) {

		int ps[] = new int[n];
		int ss[] = new int[n];

		ps[0] = arr[0];
		ss[n - 1] = arr[n - 1];

		for (int i = 1; i < n; i++) {
			ps[i] = ps[i - 1] + arr[i];
		}

		for (int i = n - 2; i >= 0; i--) {
			ss[i] = ss[i + 1] + arr[i];
		}

		for (int i = 0; i < n; i++) {
			if (ps[i] == ss[i]) {

				if (i == 0 && 0 == ss[i + 1])
					return true;

				if (i == n - 1 && 0 == ps[i - 1])
					return true;

				if (ps[i - 1] == ss[i + 1])
					return true;
			}
		}

		return false;
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
