// Day 01
// Problem: Maximum Subarray
// Pattern: Arrays / Dynamic Programming / Kadane's Algorithm
// Difficulty: Medium
// Platform: LeetCode
// Time Complexity: O(n)
// Space Complexity: O(1)
import java.util.*;
class Solution {
    public static int maxSubArray(int[] nums) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        
        for (int i = 0; i < nums.length; i++) {
            currSum += nums[i];
            maxSum = Math.max(currSum, maxSum);
            if (currSum < 0) {
                currSum = 0;
            }
        }
        
        return maxSum;
    } public static void main(String arg[]){
        int arr[]={3,2,3,-1,-2,5};
        System.out.println(maxSubArray(arr));
    }
}
