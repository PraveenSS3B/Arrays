package in.Arrays;

public class MaxDiffProblemWithOrder {

	public static void main(String[] args) {
//		int arr[] = { 2, 3, 10, 6, 4, 8, 1 };

//		int arr[] = { 7, 9, 5, 6, 3, 2 };

//		int arr[] = { 10, 20, 30 };

//		int arr[] = { 30, 10, 8, 2 };

//		int arr[] = { 34, 8, 10, 3, 2, 80, 30, 33, 1 };
		
		int arr[] = {100, 2, 10, 9, 32, -1, 4};
		
		System.out.println(find(arr, arr.length));
	}

	private static int find(int[] arr, int n) {

		int maxi = Integer.MIN_VALUE;

		int current = arr[n - 1];

		for (int i = n - 2; i >= 0; i--) {
			maxi = Math.max(maxi, current - arr[i]);

			current = Math.max(current, arr[i]);
		}

		return maxi;
	}

}
