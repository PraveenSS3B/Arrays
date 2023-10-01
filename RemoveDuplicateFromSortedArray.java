package in.Arrays;

public class RemoveDuplicateFromSortedArray {

	public static void main(String[] args) {
//		int arr[] = { 1, 2, 2, 4 };

		int arr[] = { 1, 2, 2, 2, 2, 2 };

		int n = removeDuplicate(arr, arr.length);

		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	private static int removeDuplicate(int[] arr, int n) {

		int temp[] = new int[n];

		temp[0] = arr[0];

		int tempSize = 1;

		for (int i = 1; i < n; i++) {
			if (temp[tempSize - 1] != arr[i]) {
				temp[tempSize] = arr[i];
				tempSize++;
			}
		}

		return tempSize;
	}

}
