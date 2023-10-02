package in.Arrays;

import java.util.Arrays;

public class RightRotateArrayByNTimes {

	public static void main(String[] args) {
		int arr[] = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };

		System.out.println("Original Array :\n" + Arrays.toString(arr));

		int d = 1;

		arr = rotateRightByD(arr, d, arr.length);

		System.out.println("\nRotated Array using Best Method :\n" + Arrays.toString(arr));

	}

	private static int[] rotateRightByD(int[] arr, int d, int n) {

		if (d > n)
			d = d % n;

		int tmp[] = new int[d];

		for (int i = 0; i < d; i++)
			tmp[i] = arr[n - d + i];

		for (int i = n - 1; i >= d; i--)
			arr[i] = arr[i - d];

		for (int i = 0; i < d; i++)
			arr[i] = tmp[i];

		return arr;

	}
}
