package in.Arrays;

public class MaxCircularSubArraySum {

	public static void main(String[] args) {
		int arr[] = { 10, 5, -5 };

		System.out.println(find(arr, arr.length));

	}

	// Naive Approach - O(n^2)
	private static int find(int[] arr, int n) {
		int res = arr[0];

		for (int i = 0; i < n; i++) {
			int currMax = arr[i];

			int currSum = arr[i];

			for (int j = 1; j < n; j++) {
				int idx = (i + j) % n;

				currSum += arr[idx];

				currMax = Math.max(currMax, currSum);
			}

			res = Math.max(currMax, res);
		}

		return res;
	}

}
