package in.Arrays;

public class MaxSumSubArray {

	public static void main(String[] args) {

//		int arr[] = { 2, 3, -8, 7, -1, 2, 3 };

//		int arr[] = {10, -6};

		int arr[] = { 1, 2, 3, -2, 5 };

		System.out.println(find(arr, arr.length));

	}

	private static int find(int[] arr, int n) {
		int ms = arr[0];

		int cs = arr[0];

		for (int i = 1; i < n; ++i) {
			cs = Math.max(arr[i], arr[i] + cs);

			ms = Math.max(ms, cs);
		}

		return ms;

	}

}
