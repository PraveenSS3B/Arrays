package in.Arrays;

public class CheckIfArrayIsSorted {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 3 };

		System.out.println(check(arr, arr.length));
	}

	private static boolean check(int[] arr, int length) {

		for (int i = 1; i < length; i++) {
			if (arr[i - 1] > arr[i])
				return false;
		}

		return true;

	}

}
