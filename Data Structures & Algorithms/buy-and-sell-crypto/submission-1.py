class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        res=0
        mins=prices[0]
        for i in range(0,len(prices)):
            mins=min(mins,prices[i])
            res=max(res,prices[i]-mins)
        return res