package in.Arrays;

public class MaxConsecutiveOnes {

	public static void main(String[] args) {
//		int arr[] = { 0, 1, 1, 0, 1, 0 };
//		int arr[] = { 1, 1, 1, 1 };
//		int arr[] = { 0, 0, 0 };
//		int arr[] = { 1, 0, 1, 1, 1, 1, 0, 1, 1 };
//		int arr[] = { 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1 };
		int arr[] = { 0, 1, 1, 0, 0, 1, 1, 1 };
//		int arr[] = { 1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1 };

		System.out.println(find(arr, arr.length));

	}

	private static int find(int[] arr, int n) {

		int c = 0;

		int maxC = 0;

		for (int i = 0; i < n; i++) {
			if (arr[i] != 0) {
				c++;
			} else {
				c = 0;
			}

			maxC = Math.max(maxC, c);

		}

		return maxC;

	}

}
