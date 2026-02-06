package Day51.minimumRemovalstoBalanceArray;
import java.util.*;
class Solution {
    public static int minRemoval(int[] nums, int k) {
        // we need to sort array for getthe max and min easyly
        Arrays.sort(nums);
        //i use the two pointer approacch to get largest balance array
        int i=0;
        int j=0;
        int n=nums.length;
        int l=Integer.MIN_VALUE;
        while(j<n ){
            if(nums[j]<=(long)nums[i]*k){
                l=Math.max(j-i+1,l);
                j++;
            }else{
                i++;
            }
        }
        return n-l;
    }
    public static void main(String arg[]){
        int arr[]={1,2,6,9};
        System.out.println(minRemoval(arr,3));
    }
}
