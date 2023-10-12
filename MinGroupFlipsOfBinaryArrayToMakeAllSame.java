package in.Arrays;

public class MinGroupFlipsOfBinaryArrayToMakeAllSame {

	public static void main(String[] args) {
//		int arr[] = { 1, 1, 0, 0, 0, 1 };

		int arr[] = { 1, 0, 0, 0, 1, 0, 0, 1, 1, 1, 1 };

		find(arr, arr.length);
	}

	private static void find(int[] arr, int n) {

		for (int i = 1; i < n; i++) {
			if (arr[i] != arr[i - 1]) {
				if (arr[i] != arr[0])
					System.out.print("From " + i);

				else
					System.out.print(" to " + (i - 1 + "\n"));
			}
		}

		if (arr[n - 1] != arr[0])
			System.out.print(" to " + (n - 1));

	}

}
