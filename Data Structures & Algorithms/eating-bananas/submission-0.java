class Solution {
   public int calculate(int[] piles, int speed)
   {
    int totalh=0;
    for(int i:piles)
    {
        totalh+=(int)Math.ceil((double)i/speed);
    }
    return totalh;
   }
   public int minEatingSpeed(int[] piles, int h) {
        int maxpile=Arrays.stream(piles).max().getAsInt();
        int low=1;
        int high=maxpile;
        int ans=maxpile;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            int totalH=calculate(piles,mid);
            if(totalH<=h)
            {
                ans=mid;
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return ans;
    }
}
