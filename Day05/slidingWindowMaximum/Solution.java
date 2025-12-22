import java.util.*;
class Solution {
    public static int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        int ans[]=new int[n-k+1];
        Deque <Integer> dp=new ArrayDeque<>();
        for(int i=0;i<k;i++){
            while(dp.size()>0 && nums[dp.getLast()]<=nums[i]){ 
                 dp.removeLast();
            }
            dp.addLast(i);
        }
        int index=0;
        for(int i=k;i<n;i++){
            ans[index]=nums[dp.getFirst()];
            //remove the all index which do not in current windows
            while(dp.size()>0 && dp.getFirst()<=i-k){
                dp.removeFirst();
            }
            //remove element which is less than equal to nums[i]
            while(dp.size()>0 && nums[dp.getLast()]<=nums[i]){
                dp.removeLast();

            }
            dp.addLast(i);
            index++;
        }
        ans[index]=nums[dp.getFirst()];
        return ans;
    }
    public static void main(String arg[]){
        int nums[]={1,3,-1,-3,5,3,6,7};
        int arr[]=maxSlidingWindow(nums,3);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}