import java.util.*;
class Solution {
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int ans=nums[0]+nums[1]+nums[2];
        for(int i=0;i<nums.length-1;i++){
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if(Math.abs(target-sum)<Math.abs(target-ans)){
                    ans=sum;
                }

                if(sum==target) return target;
                else if(sum<target) j++;
                else k--;
            }
        }
        return ans;
    }
    public static void main(String arg[]){
        System.out.print(threeSumClosest(new int[]{-4,-1,1,2},1));
    }
}