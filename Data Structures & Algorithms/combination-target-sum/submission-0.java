class Solution {
    public void generate(int nums[],int index,int target,List<Integer> arr,List<List<Integer>> list)
    {
        if(target==0)
        {
            list.add(new ArrayList<>(arr));
            return;
        }
        if(index==nums.length || target<0)
        {
            return;
        }
      
         if(nums[index]<=target)
         {
         arr.add(nums[index]);
         generate(nums,index,target-nums[index],arr,list);
         arr.remove(arr.size()-1);
         }
         generate(nums,index+1,target,arr,list);
         
       
    }
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> arr=new ArrayList<>();
        generate(nums,0,target,arr,list);
        return list;
    }
}
