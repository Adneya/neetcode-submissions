class Solution {
    public void generate(int[] nums,int index,List<Integer> arr,List<List<Integer>>list)
    {
        if(index>=nums.length)
        {
            list.add(new ArrayList<>(arr));
            return;
        }
        arr.add(nums[index]);
        generate(nums,index+1,arr,list);
        arr.remove(arr.size()-1);
        generate(nums,index+1,arr,list);
       

    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>list=new ArrayList<>();
        List<Integer> arr=new ArrayList<>();
        generate(nums,0,arr,list);
        return list;
    }
}
