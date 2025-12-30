class Solution {
    public static int missingNumber(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        int n=nums.length;
        int total=(n*(n+1))/2;
        return total-sum;
    }
    public static void main(String arg[]){
        int nums[]={3,0,1};
        System.out.println(missingNumber(nums));
    }
}