class Solution {
    public int maxProfit(int[] prices) {
        int minsofar=prices[0];
        int maxi = 0;
        for(int i=0;i<prices.length;i++)
        {
            minsofar = Math.min(minsofar,prices[i]);
            int profit = prices[i]-minsofar;
            maxi = Math.max(maxi,profit);
        }
        return maxi;
    }
}