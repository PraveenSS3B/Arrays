package in.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class LeaderOfArray {

	public static void main(String[] args) {
		int A[] = { 29, 10, 21, 22, 90, 32, 21, 11, 32 };

//		int A[] = { 16, 17, 4, 3, 5, 2 };

		ArrayList<Integer> l = new ArrayList<Integer>();

		System.out.print(Arrays.toString(find(A, A.length, l).toArray()) + " ");
	}

	private static ArrayList<Integer> find(int[] A, int n, ArrayList<Integer> l) {

		int current = A[n - 1];

		l.add(current);

		for (int i = n - 2; i >= 0; i--) {

			if (A[i] >= current) {
				l.add(A[i]);
				current = A[i];
			}

		}
		return l;
	}
}
