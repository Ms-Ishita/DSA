class Solution {
    
    public int maxProfit(int[] prices) {
        int minbuy = prices[0];
        int maxprofit =0;
        

        for(int i = 1; i<prices.length; i++){
            int profit = prices[i]-minbuy;
            maxprofit = Math.max(maxprofit, profit);
            minbuy = Math.min(prices[i], minbuy);

        }
        return maxprofit;
     
    }
}