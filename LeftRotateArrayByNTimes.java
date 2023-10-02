package in.Arrays;

import java.util.Arrays;

public class LeftRotateArrayByNTimes {

	public static void main(String[] args) {
		int arr[] = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };

		int d = 3;

		arr = rotateLeftByD(arr, d, arr.length);

		System.out.println(Arrays.toString(arr));
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

}
