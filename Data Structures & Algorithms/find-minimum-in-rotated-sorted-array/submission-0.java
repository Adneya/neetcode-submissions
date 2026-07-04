class Solution {
    public int findMin(int[] nums) {
        int mins=nums[0];
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
        {
            mins=Math.min(mins,nums[i]);
        }
return mins;
    }
}
