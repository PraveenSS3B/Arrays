package in.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintPattern {

	public static void main(String[] args) {
		System.out.print(Arrays.toString(pattern(16).toArray()) + " ");
	}

	static List<Integer> pattern(int N) {
		List<Integer> al = new ArrayList<>();
		solve(N, N, al);
		return al;
	}

	static void solve(int ans, int N, List<Integer> al) {
		if (N <= 0) {
			al.add(N);
			return;
		}

		al.add(N);
		solve(ans, N - 5, al);
		al.add(N);
		
	}

}
