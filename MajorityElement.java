package in.Arrays;

public class MajorityElement {

	public static void main(String[] args) {

//		int arr[] = { 8, 3, 4, 8, 8 };

//		int arr[] = { 20, 30, 40, 50, 50, 50, 50 };

		int arr[] = { 3, 1, 3, 3, 2 };

		System.out.println(find(arr, arr.length));

	}

	private static int find(int[] arr, int n) {
		int c = 1;

		int idx = 0;

		for (int i = 1; i < n; i++) {
			if (arr[idx] == arr[i]) {
				c++;
			}

			else {
				c--;
			}

			if (c == 0) {
				idx = i;
				c = 1;
			}
		}

		c = 0;

		for (int i = 0; i < n; i++) {
			if (arr[idx] == arr[i])
				c++;
		}

		if (c > n / 2)
			return idx;

		return -1;

	}

}
