class Solution {
    public static int findTargetSumWays(int[] nums, int target) {
    
        int count=solve(0,target,nums,0);
        return count;
    }
    public static int solve(int sum,int target,int nums[],int index){
        if(index==nums.length){
            return (sum==target)?1:0; 
        }
     
        int plus=solve(sum+nums[index],target,nums,index+1);
        int minus=solve(sum-nums[index],target,nums,index+1);
        return plus+minus;
    }
    public static void main(String arg[]){
        System.out.println(findTargetSumWays(new int[]{1,1,1,1,1},3));
    }
}