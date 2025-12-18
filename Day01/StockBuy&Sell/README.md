# Problem: Best Time to Buy and Sell Stock

## Description
You are given an array `prices` where `prices[i]` is the price of a given stock on the i-th day.  
You want to maximize your profit by choosing **one day to buy** and **one day to sell** the stock.  
Return the **maximum profit** you can achieve. If you cannot achieve any profit, return 0.

### Example:
Input: [7,1,5,3,6,4]  
Output: 5  
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.

Input: [7,6,4,3,1]  
Output: 0  
Explanation: No transaction is done, maximum profit = 0.

### Constraints:
- 1 ≤ prices.length ≤ 10⁵
- 0 ≤ prices[i] ≤ 10⁴

### Pattern
Arrays / Greedy

### Difficulty
Easy

---

### Approach
Use a **greedy approach**:
1. Initialize `buyPrice` as the first element and `profit = 0`.
2. Traverse the array:
   - If current price > `buyPrice`, update `profit = max(profit, prices[i] - buyPrice)`
   - Else, update `buyPrice = prices[i]`
3. Return `profit` as the maximum achievable profit.

### Time Complexity
O(n)

### Space Complexity
O(1)

### Platform
LeetCode
