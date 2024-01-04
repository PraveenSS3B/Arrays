class FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;

        HashSet<List<Integer>> q = new HashSet<>();

        // Arrays.sort(nums);

        for(int i = 0; i < n; i++)
        {
            for(int j = i+1; j < n; j++)
            {
                HashSet<Long> set = new HashSet<>();
                for(int k = j+1; k < n;k++)
                {
                    // int sum = target-(nums[i] + nums[j] + nums[k]);
                    long sum = nums[i] + nums[j];
                    sum += nums[k];

                    long fourth = target - sum;

                    if(set.contains(fourth))
                    {
                        List<Integer> tmp = Arrays.asList((int)fourth, nums[i], nums[j],  nums[k]);
                        Collections.sort(tmp);
                        q.add(tmp);
                    }

                    set.add((long)nums[k]);
                }
            }

            
        }

        return new ArrayList<>(q);
    }
}
