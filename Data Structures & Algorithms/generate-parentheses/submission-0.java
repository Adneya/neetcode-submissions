class Solution {
    public void generate(int n,String curr,int open ,int close,List<String> arr)
    {
        if(curr.length()==n*2)
        {
            arr.add(curr);
            return;
        }
        if(n<0)
        {
            return;
        }
        if(open<n)
        {
            generate(n,curr+"(",open+1,close,arr);
        }
        if(close<open)
        {
            generate(n,curr+")",open,close+1,arr);
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> arr=new ArrayList<>();
        String curr="";
        int open=0;
        int close=0;
        generate(n,curr,open,close,arr);
        return arr;
    }
}
