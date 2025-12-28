import java.util.*;
class Solution {
    public static int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int sum=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            int remove=sum-k;
            if(map.containsKey(remove)){
                count=count+map.get(remove);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    }
    public static void main(String arg[]){
        int nums[]={1,2,3};
        System.out.println(subarraySum(nums,3));
    }
}