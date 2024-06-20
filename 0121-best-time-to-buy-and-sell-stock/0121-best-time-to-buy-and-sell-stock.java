class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        
        int buy = prices[0];
        for(int i=1; i<prices.length; i++){
            buy = Math.min(buy, prices[i-1]);
            max = Math.max(max, prices[i]-buy);
        }
        
        return max > 0 ? max : 0;
    }
}
