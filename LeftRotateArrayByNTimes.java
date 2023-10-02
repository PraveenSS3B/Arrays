package in.Arrays;

import java.util.Arrays;

public class LeftRotateArrayByNTimes {

	public static void main(String[] args) {
		int arr[] = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };

		System.out.println("Original Array :\n" + Arrays.toString(arr));

		int d = 3;

		arr = rotateLeftByD(arr, d, arr.length);

		System.out.println("\nRotated Array using Best Method :\n" + Arrays.toString(arr));

		int arr1[] = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };

		rotate(arr1, d, arr.length);
		System.out.println("\nRotated Array using Efficient Method :\n" + Arrays.toString(arr1));
	}

	private static int[] rotateLeftByD(int[] arr, int d, int n) {

		if (d > n)
			d = d % n;

		int tmp[] = new int[d];

		for (int i = 0; i < d; i++)
			tmp[i] = arr[i];

		for (int i = d; i < n; i++)
			arr[i - d] = arr[i];

		for (int i = 0; i < d; i++)
			arr[n - d + i] = tmp[i];

		return arr;
	}

	private static void rotate(int[] arr, int d, int n) {

		d = d % n;
		reverse(arr, 0, d - 1);
		reverse(arr, d, n - 1);
		reverse(arr, 0, n - 1);
	}

	private static void reverse(int[] arr, int low, int high) {
		while (low < high) {
			int tmp = arr[low];
			arr[low] = arr[high];
			arr[high] = tmp;

			low++;
			high--;
		}
	}
}
