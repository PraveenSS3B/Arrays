package in.Arrays;

public class MaximumIndex {

	public static void main(String[] args) {
		int arr[] = { 34, 8, 10, 3, 2, 80, 30, 33, 1 };

		System.out.println(find(arr, arr.length));

	}

	private static int find(int[] arr, int n) {
		int left[] = new int[n];

		int right[] = new int[n];

		left[0] = arr[0];

		right[n - 1] = arr[n - 1];

		for (int i = 1; i < n; i++)
			left[i] = Math.min(left[i - 1], arr[i]);

		for (int i = n - 2; i >= 0; i--)
			right[i] = Math.max(right[i + 1], arr[i]);

		int i = 0, j = 0, res = 0;

		while (i < n && j < n) {
			if (left[i] <= right[j]) {
				res = Math.max(j - i, res);
				j++;
			}

			else
				i++;
		}

		return res;

	}

}
