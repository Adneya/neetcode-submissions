class Solution {
    public int findDuplicate(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int num:nums)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer> mp:map.entrySet())
        {
            int value=mp.getValue();
            int key=mp.getKey();
            if(value>1)
            {
                return key;
            }
        }
        return 0;
    }
}
