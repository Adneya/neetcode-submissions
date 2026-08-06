class Solution {
    public void generate(int[] nums,int index,List<Integer> arr,List<List<Integer>> list)
    {
       
            list.add(new ArrayList<>(arr));
        
        
         
        for(int i=index;i<nums.length;i++)
        {
            if(i>index && nums[i]==nums[i-1])
            {
                continue;
            }
            arr.add(nums[i]);
            generate(nums,i+1,arr,list);
            arr.remove(arr.size()-1);
            

        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> arr=new ArrayList<>();
        generate(nums,0,arr,list);
        return list;
    }
}
