package Day48.trionicArraysI;

class Solution {
    public static boolean isTrionic(int[] nums) {
        int i=1;
        int p=-1;
        while(i<nums.length){
            if(nums[i-1]>=nums[i]){
                p=i-1;
                break;
            }
            i++;
        }
        if(i>=nums.length-1 || p==0){
            return false;
        }
        
        while(p<nums.length-1){
            if(nums[p]<=nums[p+1]){
                break;
            }
            p++;
        }
        
        if(p==nums.length-1){
            return false;
        }
        while(p<nums.length-1){
            if(nums[p]>=nums[p+1]){
                return false;
            }
            p++;
        }return true;
    }
    public static void main(String arg[]){
        int nums[]={1,2,1,3,4};
        System.out.println(isTrionic(nums));
    }
}
