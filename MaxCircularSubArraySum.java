package in.Arrays;

public class MaxCircularSubArraySum {

	public static void main(String[] args) {
//		int arr[] = { 10, 5, -5 };

//		int arr[] = { 8, -4, 3, -5, 4 };

		int arr[] = { -3, -18, -22, -21, -17, 16, -14, 28, -22 };

		System.out.println("Naive Approach : " + find(arr, arr.length));

		System.out.println("Efficient Approach : " + getMaxCirSum(arr, arr.length));

	}

	private static int normalMaxSubArraySum(int[] arr, int n) {
		int res = arr[0];

		int cs = arr[0];

		for (int i = 1; i < n; i++) {
			cs = Math.max(arr[i], arr[i] + cs);

			res = Math.max(cs, res);
		}

		return res;
	}

	private static int getMaxCirSum(int[] arr, int n) {

		int ns = normalMaxSubArraySum(arr, n);

		if (ns < 0)
			return ns;

		int arrSum = 0;

		for (int i = 0; i < n; i++) {
			arrSum += arr[i];
			arr[i] = -arr[i];
		}

		int circularSum = arrSum + normalMaxSubArraySum(arr, n);

		return Math.max(ns, circularSum);

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
