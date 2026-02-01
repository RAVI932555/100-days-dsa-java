import java.util.*;
class Solution {
    public static int minimumCost(int[] nums) {
        int min1=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<min1){
                min2=min1;
                min1=nums[i];
            }else if(nums[i]<min2){
                min2=nums[i];
            }
        }
        return nums[0]+min1+min2;
    }
    public static void main(String[] args) {
        System.out.println(minimumCost(new int[]{10,1,1,5}));
    }
}