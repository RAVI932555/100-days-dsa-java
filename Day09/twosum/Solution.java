import java.util.*;
class Solution {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int arr[]={-1,-1};
        for(int i=0;i<nums.length;i++){
            int sum=target-nums[i];
            if(map.containsKey(target-nums[i])){
                arr[0]=map.get(sum);
                arr[1]=i;
                return arr;
            }
            map.put(nums[i],i);
        }
        return arr;
    }
    public static void main(String arg[]){
        int nums[]={2,7,11,15};
        int arr[]=twoSum(nums,9);
    }
}