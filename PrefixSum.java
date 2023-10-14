package in.Arrays;

import java.util.Arrays;

public class PrefixSum {

	public static void main(String[] args) {
		int arr[] = { 2, 8, 3, 9, 6, 5, 4 };

		System.out.println("Original Array  = " + Arrays.toString(arr));

		int prefixSum[] = new int[arr.length];

		prefixSum[0] = arr[0];

		for (int i = 1; i < arr.length; i++) {
			prefixSum[i] = prefixSum[i - 1] + arr[i];
		}

		System.out.println("Prefix Sum Array  = " + Arrays.toString(prefixSum));

		System.out.println(getSum(prefixSum, 0, 3));

		System.out.println(getSum(prefixSum, 1, 3));

		System.out.println(getSum(prefixSum, 2, 6));

	}

	private static int getSum(int[] prefixSum, int i, int j) {
		if (i == 0)
			return prefixSum[j];

		return prefixSum[j] - prefixSum[i - 1];
	}

}
