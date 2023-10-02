package in.Arrays;

import java.util.LinkedHashMap;
import java.util.Map;

public class RemoveDuplicateFromUnSortedArray {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 1, 4, 2 };

		System.out.println("Original Array : ");
		for (int ii = 0; ii < arr.length; ii++) {
			System.out.print(arr[ii] + " ");
		}

		int[] distinctElements = removeDuplicate(arr, arr.length);

		System.out.println("\nRemoved Duplicates Array : ");
		for (int ii = 0; ii < distinctElements.length; ii++) {
			System.out.print(distinctElements[ii] + " ");
		}

	}

	private static int[] removeDuplicate(int A[], int N) {
		Map<Integer, Integer> m = new LinkedHashMap<>();

		m.put(A[0], A[0]);

		for (int i = 1; i < N; i++) {
			if (A[i] == m.getOrDefault(A[i], 0))
				continue;

			m.put(A[i], A[i]);
		}

		int ii = 0;
		int ans[] = new int[m.size()];
		for (Map.Entry<Integer, Integer> entry : m.entrySet()) {
			ans[ii++] = entry.getKey();
		}

		return ans;
	}

}
