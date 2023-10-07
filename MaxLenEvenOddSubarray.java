package in.Arrays;

public class MaxLenEvenOddSubarray {

	public static void main(String[] args) {
//		int arr[] = { 10, 12, 14, 7, 8 };

//		int arr[] = { 9, 1, 2, 3, 1, 4, 6, 1, 8, 9, 4, 6, 1 };

//		int arr[] = { 10, 12, 8, 4 };

		int arr[] = { 1, 1, 1, 1, 1, 1 };

//		int arr[] = { 3, 8, 5, 8, 4, 1, 6 };

		System.out.println(find(arr, arr.length));
	}

	private static int find(int[] arr, int n) {
		int c = 1, maxi = 1;

		for (int i = 1; i < n; i++) {
			if ((arr[i] % 2 == 0 && arr[i - 1] % 2 != 0) || (arr[i - 1] % 2 == 0 && arr[i] % 2 != 0)) {
				c++;
			}

			else
				c = 1;

			maxi = Math.max(maxi, c);
		}

		return maxi;
	}

}
