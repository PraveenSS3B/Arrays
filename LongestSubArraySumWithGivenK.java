import java.util.*;
import java.io.*;

public class Solution {
	public static int getLongestSubarray(int[] nums, int k) {
		int n = nums.length, sum = 0, ans = 0;

		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < n; i++) {

			sum += nums[i];

			if (sum == k)
				ans = i + 1;

			if (!map.containsKey(sum)) {
				map.put(sum, i);
			}

			if (map.containsKey(sum - k)) {
				ans = Math.max(ans, i - map.get(sum - k));
			}
		}

		return ans;

	}
}
