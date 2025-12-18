// Day 01
// Problem: Best Time to Buy and Sell Stock
// Pattern: Arrays / Greedy
// Difficulty: Easy
// Platform: LeetCode
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public static int maxProfit(int[] prices) {
        int buyPrice = prices[0];
        int profit = 0;
        
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] > buyPrice) {
                profit = Math.max(profit, prices[i] - buyPrice);
            } else {
                buyPrice = prices[i];
            }
        }
        
        return profit;
    }
    public static void main(String arg[]){
        int prices[]={7,1,5,6,4,2};
        System.out.println(maxProfit(prices));
    }
}
