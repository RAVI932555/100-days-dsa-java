class Solution {
    public static double findMaxAverage(int[] nums, int k) {
        double maxans=Integer.MIN_VALUE;
        int i=0;
        int j=0;
        double sum=0;
        while(j<nums.length){
            sum+=nums[j];
            if((j-i+1)==k){
                maxans=Math.max(maxans,(double)(sum)/k);
                sum-=nums[i];
                i++;
            }
           j++;
        }
        return maxans;
    }
    public static void main(String arg[]){
        int nums[]={1,12,-5,-6,50,3};
        System.out.println(findMaxAverage(nums,4));
    }
}