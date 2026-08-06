class Solution {
    public void generate(int[] candidates,int index,int target,List<Integer> arr,List<List<Integer>> list)
    {
        if(target==0)
        {
            list.add(new ArrayList<>(arr));
            return;
        }
      
        for(int i=index;i<candidates.length;i++)
        {
            if(i>index && candidates[i]==candidates[i-1])
            {
                continue;
            }
            if(candidates[i]>target)
            {
                break;
            }
            arr.add(candidates[i]);
            generate(candidates,i+1,target-candidates[i],arr,list);
            arr.remove(arr.size()-1);
        }

    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> arr=new ArrayList<>();
        generate(candidates,0,target,arr,list);
        return list;
    }
}
