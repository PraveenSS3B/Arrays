package in.Arrays;

public class TrappingRainWater {

	public static void main(String[] args) {
//		int arr[] = { 2, 0, 2 };

//		int arr[] = { 3, 0, 1, 2, 5 };

		int arr[] = { 3, 0, 0, 2, 0, 4 };

//		int arr[] = { 7, 4, 0, 9 };

//		int arr[] = { 1, 2, 3 };

//		int arr[] = { 3, 2, 1 };

//		[3,3,3]

//		[3,2,2]

		long amt = findAmtOfWaterTrapped(arr, arr.length);

		System.out.println(amt);

	}

	// Optimal Solution - T.C - O(n) ; A.S - O(1)
	private static long findAmtOfWaterTrapped(int[] arr, int n) {

		int qty = 0;

		int lMax = 0;

		int rMax = 0;

		int left = 0, right = n - 1;

		while (left <= right) {
			if (arr[left] <= arr[right]) {
				if (arr[left] > lMax) {
					lMax = arr[left];
				}

				else {
					qty += (lMax - arr[left]);
				}
				left++;
			}

			else {
				if (arr[right] > rMax) {
					rMax = arr[right];
				}

				else {
					qty += (rMax - arr[right]);
				}
				right--;
			}
		}

		return qty;
	}

}
