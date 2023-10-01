package in.Arrays;

public class SecondLargestElement {

	public static void main(String[] args) {
//		int arr[] = { 2, 10, 3, 100, 76, 54, 32, 46 };
		int arr[] = { 2, 2, 2, 2, 2, 2, 2 };
		System.out.println(find(arr));
	}

	private static int find(int[] arr) {

		int largest = Integer.MIN_VALUE;

		int secondLargest = largest + 1;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];
			}

			else if (arr[i] > secondLargest && arr[i] != largest) {
				secondLargest = arr[i];
			}
		}

		return secondLargest == Integer.MIN_VALUE ? -1 : secondLargest;
	}

}
