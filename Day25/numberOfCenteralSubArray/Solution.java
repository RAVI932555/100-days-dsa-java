import java.util.*;
class Solution {
    public static int centeredSubarrays(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            int sum=0;
            Set<Integer> map=new HashSet<>();
            for(int j=i;j<nums.length;j++){
                
                sum+=nums[j];
                map.add(nums[j]);
                if(map.contains(sum)){
                    ans++;
                }
            }
        }
        return ans;
    }
    public static void main(String arg[]){
        System.out.println(centeredSubarrays(new int[]{-2,-1,1,2}));
    }
}