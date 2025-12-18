// Day 01
// Problem: Majority Element
// Pattern: Arrays /  Counting
// Difficulty: Easy
// Platform: LeetCode
// Time Complexity: O(n)
// Space Complexity: O(1) using Boyer-Moore

class Solution {
    public static int majorityElement(int[] nums) {
        int count = 1;
        int num = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (count == 0) {
                num = nums[i];
                count = 1;
            } else if (nums[i] == num) {
                count++;
            } else {
                count--;
            }
        }
        return num;
    }
    public static void main(String arg[]){
        int arr[]={3,2,3};
        System.out.println(majorityElement(arr));
    }
}
