# Problem: Maximum Subarray

## Description
Given an integer array `nums`, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

### Example:
Input: [-2,1,-3,4,-1,2,1,-5,4]  
Output: 6  
Explanation: [4,-1,2,1] has the largest sum = 6.

Input: [1]  
Output: 1

### Constraints:
- 1 ≤ nums.length ≤ 10⁵
- -10⁴ ≤ nums[i] ≤ 10⁴

### Pattern
Arrays / Kadane’s Algorithm

### Difficulty
Medium

### Approach
Use Kadane’s Algorithm:
1. Initialize `currSum = 0` and `maxSum = Integer.MIN_VALUE`.
2. Traverse the array:
   - Add current element to `currSum`
   - Update `maxSum` if `currSum` is larger
   - If `currSum < 0`, reset `currSum = 0`
3. Return `maxSum` as the maximum subarray sum.

### Time Complexity
O(n)

### Space Complexity
O(1)

### Platform
LeetCode
