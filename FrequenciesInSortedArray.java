package in.Arrays;

public class FrequenciesInSortedArray {

	public static void main(String[] args) {
//		int arr[] = { 10, 10, 10, 25, 30, 30 };

//		int arr[] = { 40, 50, 50, 50 };

		int arr[] = { 2, 3, 4, 4, 5, 6, 7, 8, 8, 8, 9 };

		frequencies(arr, arr.length);
	}

	private static void frequencies(int[] arr, int n) {
		int c = 1;
		int ele = arr[0];
		for (int i = 1; i < n; i++) {
			if (ele == arr[i]) {
				c++;
			}

			else {
				System.out.println(arr[i - 1] + " = " + c);
				ele = arr[i];
				c = 1;
			}

		}

		System.out.println(arr[n - 1] + " = " + c);
	}

}
