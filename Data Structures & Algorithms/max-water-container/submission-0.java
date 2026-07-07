class Solution {
    public int maxArea(int[] heights) {
     int res=0;
     int water=heights[0];
     for(int i=0;i<heights.length;i++)
     {
        for(int j=i+1;j<heights.length;j++)
        {
            water=Math.min(heights[i],heights[j])*(j-i);
            res=Math.max(res,water);
        }
     }
     return res;
    }
}
