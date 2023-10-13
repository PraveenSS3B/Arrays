package in.Arrays;

public class WindowSlidingTechnique {

	public static void main(String[] args) {
		int arr[] = { 1, 8, 30, -5, 20, 7 };

		int k = 3;

		System.out.println(findMaxSum(arr, k));
	}

	private static int findMaxSum(int[] arr, int k) {
		int maxi = 0;

		int currSum = 0;

		for (int i = 0; i < k; i++) {
			currSum += arr[i];
		}

		maxi = currSum;

		for (int i = k; i < arr.length; i++) {
			currSum = currSum + arr[i] - arr[i - k];
			maxi = Math.max(maxi, currSum);
		}

		return maxi;

	}

}
