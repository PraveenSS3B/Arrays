class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        HashSet<List<Integer>> tripletSet = new HashSet<>();
        // Arrays.sort(nums);
        int n = nums.length;

        for(int i = 0; i < n; i++)
        {
            HashSet<Integer> set = new HashSet<>();
            for(int j = i + 1; j < n; j++)
            {
                int target = -(nums[i] + nums[j]);

                if(set.contains(target))
                {
                    List<Integer> triplet = Arrays.asList(target, nums[i], nums[j]);
                    Collections.sort(triplet);
                    // if you comment the above and uncomment the Line 5 it will also work.
                    tripletSet.add(triplet);
                }
                else
                {
                    set.add(nums[j]);
                }
                
            }

            // set.clear();
        }


        return new ArrayList<>(tripletSet);

//T.C - O(n^2 * log(n); S.C - O(N) + O(no. of triplets)
    }
}
