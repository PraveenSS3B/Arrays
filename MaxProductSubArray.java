class MaxProductSubArray {
    public int maxProduct(int[] nums) {
        int max = nums[0], ans = nums[0], min = nums[0];

        for(int i = 1; i < nums.length; i++)
        {
            int maxProduct = Math.max(max * nums[i], min * nums[i]);
            int minProduct = Math.min(max * nums[i], min * nums[i]);
            
            max = Math.max(maxProduct, nums[i]);
            min = Math.min(minProduct, nums[i]);
            
            ans = Math.max(ans, max);
        }

        return ans;
    }
}
