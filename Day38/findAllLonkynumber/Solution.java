import java.util.*;
class Solution {
    public static List<Integer> findLonely(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i]-1) || map.containsKey(nums[i]+1) || map.get(nums[i])>1){
                continue;
            }else{
                list.add(nums[i]);
            }
        }
        return list;
    }
    public static void main(String arg[]){
        List<Integer> list=findLonely(new int[]{1,2,3,5,8});

    }
}