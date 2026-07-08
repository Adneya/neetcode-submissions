class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> sum=new HashSet<>();
        int n=nums.length;
        for(int i=0;i<n-2;i++)
        {
            HashSet<Integer> seen=new HashSet<>();
            for(int j=i+1;j<n;j++)
            {
                int target=-nums[i]-nums[j];
                if(seen.contains(target))
                {
                    List<Integer> curr=Arrays.asList(nums[i],nums[j],target);
                    Collections.sort(curr);
                    sum.add(curr);
                }
                seen.add(nums[j]);
            }
        }
        return new ArrayList<>(sum);
    }
}
