// User function Template for Java

class Solution {
    public int maximumProfit(int prices[]) {
        // Code here
        int min = Integer.MAX_VALUE;
        int profit = Integer.MIN_VALUE;
        for(int i:prices){
            min = Math.min(min,i);
            profit = Math.max(profit,i-min);
        }
        return profit;
    }
}