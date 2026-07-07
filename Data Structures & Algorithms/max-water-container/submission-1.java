class Solution {
    public int maxArea(int[] heights) {
        int left=0;
        int right=heights.length-1;
        int ans=0;
        while(left<=right)
        {
            int width=right-left;
            int height=Math.min(heights[left],heights[right]);
            int store=height*width;
            ans=Math.max(ans,store);
            if(heights[left]<heights[right])
            {
                left=left+1;
            }
            else
            {
                right=right-1;
            }
        }
        return ans;
    }
}
