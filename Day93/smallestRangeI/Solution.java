class Solution {
    public int smallestRangeI(int[] nums, int k) {
        int min=nums[0];
        int max=nums[0];
        for(int e:nums){
            min=Math.min(min,e);
            max=Math.max(max,e);
        }

        return Math.max(0,max-min-2*k);
    }
}