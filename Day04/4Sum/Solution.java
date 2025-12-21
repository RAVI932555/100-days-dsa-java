import java.util.*;
class Solution {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> list=new ArrayList<>();
        Arrays.sort(nums);
        if(nums[0]>0 && target<0) return list;
        for(int i=0;i<nums.length;i++){
            while((i<nums.length && i>0) && nums[i]==nums[i-1]) i++;
            for(int j=i+1;j<nums.length;j++){
                while((j>i+1 && j<nums.length) && nums[j]==nums[j-1]) j++;
                int k=j+1,l=nums.length-1;
                while(k<l){
                    int sum=nums[i]+nums[j]+nums[k]+nums[l];
                    if(sum>target) l--;
                    else if(sum<target) k++;
                    else{
                       list.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));
                        k++;l--;
                        while(k<l && nums[k]==nums[k-1]) k++;
                    }
                }
            }
        }
        return list;
    }
     public static void main(String arg[]){
       int nums[]={-1,0,1,2,-1,-4};
       List<List<Integer>> list=fourSum(nums,0);
       list.forEach((e)->e.forEach((a)->System.out.println(a)));
    }
}