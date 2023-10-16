package in.Arrays;

public class MaxAppearingElement {

	public static void main(String[] args) {
		int left[] = { 1, 2, 5, 15 };
		int right[] = { 5, 8, 7, 18 };

		System.out.println(find(left, right, left.length));
	}

	// Naive - T.C - O(n * MAX), where Max is Freq array size
	private static int find(int[] left, int[] right, int n) {

		int freq[] = new int[100];

		for (int i = 0; i < n; i++) {
			for (int j = left[i]; j <= right[i]; j++)
				freq[j]++;
		}

		int res = 0;

		for (int i = 1; i < 100; i++) {
			if (freq[i] > freq[res])
				res = i;
		}

		return res;

	}

}
