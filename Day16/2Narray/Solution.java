import java.util.*;
class Solution {
    public static int repeatedNTimes(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                return nums[i];
            }
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        return -1;
    }
    public static void main(String arg[]){
        System.out.println(repeatedNTimes(new int[]{2,1,2,5,3,2}));
    }
}