class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
         if(n==1)
        return 0;
        int l=0,r=1;  
        int profit=0,maxprofit=0;
        while(r<n)
        {
            if(prices[r]>prices[l])
            {
                profit=prices[r]-prices[l];
                maxprofit=Math.max(profit,maxprofit);
                r++;
            }
            else
            {
                l=r;
                r++;
            }
        }
        return maxprofit;
    }
}
