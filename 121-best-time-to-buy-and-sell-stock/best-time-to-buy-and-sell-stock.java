class Solution {
    
    public int maxProfit(int[] prices) {
        int minbuy = prices[0];
        int max =0;
        

        for(int i = 1; i<prices.length; i++){
            int profit = prices[i]-minbuy;
            max = Math.max(max, profit);
            minbuy = Math.min(prices[i], minbuy);

        }
        return max;
     
    }
}