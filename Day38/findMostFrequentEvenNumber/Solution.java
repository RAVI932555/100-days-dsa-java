import java.util.*;
class Solution {
    public static int mostFrequentEven(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            }
        }
        int count=0;
        int even=Integer.MAX_VALUE;
        for(int key:map.keySet()){
            if(count<=map.get(key)){
                if(count==map.get(key)){
                    even=even<key?even:key;

                }else{
                    even=key;
                    count=map.get(key);
                }
            }
        }
        return even==Integer.MAX_VALUE?-1:even;
    }
    public static void main(String arg[]){
        int arr=mostFrequentEven(new int[]{1,2,2,4,4});
    }
}