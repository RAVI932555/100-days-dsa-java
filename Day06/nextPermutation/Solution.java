import java.util.*;
class Solution {
    public static void nextPermutation(int[] nums) {
        int index=-1;
        for(int i=nums.length-1;i>0;i--){
            if(nums[i-1]<nums[i]){
                index=i-1;
                break;
            }
        }
        if(index!=-1){
            int swap=index;
            for(int j=nums.length-1;j>index;j--){
                if(nums[j]>nums[swap]){
                    swap=j;
                    break;
                }
            }
            int temp=nums[swap];
            nums[swap]=nums[index];
            nums[index]=temp;
        }
       Arrays.sort(nums,index+1,nums.length);
    }
    public static void main(String arg[]){
        int nums[]={1,3,2};
        nextPermutation(nums);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
}