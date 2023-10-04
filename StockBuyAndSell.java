package in.Arrays;

public class StockBuyAndSell {

	public static void main(String[] args) {
//		int arr[] = { 1, 5, 3, 8, 12 };

//		int arr[] = {30,20,10};
//		
//		int arr[] = {10,20,30};
//		
//		int arr[] = { 1, 5, 3, 1, 2, 8 };

		int arr[] = { 1, 3, 5, 7, 9 };

		int maxProfit = maximizeProfit(arr, arr.length);

		System.out.println(maxProfit);

	}

	private static int maximizeProfit(int[] arr, int n) {

		int profit = 0;

		for (int i = 1; i < n; i++) {
			if (arr[i - 1] < arr[i]) {
				profit += arr[i] - arr[i - 1];
			}
		}

		return profit;
	}

}
