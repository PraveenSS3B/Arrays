package in.Arrays;

public class SubArrayConsistsOfNonNegativeElementsWithGivenSum {

	public static void main(String[] args) {
		int arr[] = { 1, 4, 20, 3, 10, 5 };

		System.out.println(findGivenSum(arr, 33));
	}

	private static String findGivenSum(int[] arr, int givenSum) {

		int currSum = 0;

		int s = 0, e = 0;

		while (e < arr.length) {
			currSum += arr[e];
			e++;
			while (currSum > givenSum) {
				currSum -= arr[s];
				s++;
			}
			if (currSum == givenSum)
				return "YES";
		}

		return "NO";

	}

}
