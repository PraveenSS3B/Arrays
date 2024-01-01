class Solution {
    public int subarraySum(int[] nums, int k) {
        int c = 0, n = nums.length, s=0;
        HashMap <Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < n; i++)
        {
            s += nums[i];
            if(s == k)
            {
                c++;
            }
            if(map.containsKey(s - k))
            {
                c += map.get(s - k);
            }

            if(map.containsKey(s))
            {
                map.put(s, map.get(s)+1);
            }
            else
            {
                map.put(s,1);
            }
        }

        return c;
    }
}
