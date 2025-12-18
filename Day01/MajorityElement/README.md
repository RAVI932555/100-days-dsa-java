# Problem: Majority Element

## Description
Given an integer array `nums` of size n, find the majority element.  
The majority element is the element that appears more than n/2 times. You may assume that the majority element always exists.

### Example:
Input: [3, 2, 3]  
Output: 3

Input: [2, 2, 1, 1, 1, 2, 2]  
Output: 2

### Constraints:
- 1 ≤ n ≤ 5 * 10⁴
- -10⁹ ≤ nums[i] ≤ 10⁹

### Pattern
Arrays / Hashing / Counting

### Difficulty
Medium

### Approach
Use Boyer-Moore Voting Algorithm:
1. Initialize num = nums[0], count = 1
2. Traverse the array:
   - If count == 0 → num = nums[i], count = 1
   - Else if nums[i] == num → count++
   - Else → count--
3. Return num

### Time Complexity
O(n)

### Space Complexity
O(1)

### Platform
LeetCode
