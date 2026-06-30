class Solution {
    public int longestConsecutive(int[] nums) {
       HashSet<Integer> set=new HashSet<>();
       for(int num:nums)
       {
        set.add(num);
       }
       int longest=0;
       for(int num1:set)
       {
        if(!set.contains(num1-1))
        {
             int length=1;
        while(set.contains(num1+length))
        {
            length++;
        }
        longest=Math.max(longest,length);
        }
        
       
       }
       return longest;
    }
}
