package in.Arrays;

import java.util.Arrays;

public class ReverseArrayWithNoExtraSpace {

	public static void main(String[] args) {
		int arr[] = { 2, 10, 3, 100, 76, 54, 32, 46 };

		System.out.println("Original Array:\n" + Arrays.toString(arr));

		System.out.println("Reversed Array:\n" + Arrays.toString(reverse(arr, arr.length)));

		int arr1[] = { 2, 10, 3, 100, 76, 54, 32, 46 };

		System.out.println("Reversed Array:\n" + Arrays.toString(reverse(arr1)));
	}

	// using for loop approach
	private static int[] reverse(int[] arr, int n) {

		for (int i = 0; i < n / 2; i++) {
			int tmp = arr[i];

			arr[i] = arr[n - i - 1];

			arr[n - i - 1] = tmp;
		}

		return arr;

	}

//	using while loop approach
	private static int[] reverse(int arr[]) {
		int low = 0;
		int high = arr.length - 1;

		while (low < high) {
			int tmp = arr[low];

			arr[low] = arr[high];

			arr[high] = tmp;

			low++;
			high--;
		}

		return arr;
	}

}
