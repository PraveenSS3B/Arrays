package in.Arrays;

import java.util.Arrays;

public class PushZerosToEnd {

	public static void main(String[] args) {
		int arr[] = { 3, 5, 0, 0, 4 };

		arr = pushZeros(arr, arr.length);

		System.out.print(Arrays.toString(arr) + " ");
	}

	private static int[] pushZeros(int[] arr, int n) {

		int sp = 0;

		for (int i = 0; i < n; i++) {
			if (arr[i] == 0)
				continue;

			else {
				int tmp = arr[i];

				arr[i] = arr[sp];

				arr[sp] = tmp;

				sp++;
			}
		}

		return arr;
	}

}
