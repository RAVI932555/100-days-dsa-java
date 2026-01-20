import java.util.*;
class Solution {
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> duplication=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(duplication.contains(nums[i])){
                return true;
            }
            duplication.add(nums[i]);
        }
        return false;
    }
    public static void main(String arg[]){
        System.out.println(containsDuplicate(new int[]{2,3,4,5,2}));
    }
}