class Solution {
    
    public int maxProfit(int[] prices) {

        int maxprofit = 0;
        int minbuy =prices[0];
        for(int i = 1; i<prices.length; i++){
            int profit = prices[i]-minbuy;

            minbuy = Math.min(prices[i], minbuy);
            maxprofit = Math.max(maxprofit, profit);
        }
        return maxprofit;
     
     
    }
}