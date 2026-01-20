import java.util.*;
class Solution {
    public static int[] intersection(int[] nums1, int[] nums2) {
       Set<Integer> map=new HashSet<>();
       for(int i=0;i<nums1.length;i++){
        map.add(nums1[i]);
       }
       ArrayList<Integer> list=new ArrayList<>();
       for(int i=0;i<nums2.length;i++){
        if(map.contains(nums2[i]) && !list.contains(nums2[i])){
            list.add(nums2[i]);
           
        }
       }
       int arr[]=new int[list.size()];
       for(int i=0;i<list.size();i++){
        arr[i]=list.get(i);
       }
       return arr;
    }
    public static void main(String arg[]){
        int arr[]=intersection(new int[]{1,2,2},new int[]{3,4,5,2});
    }
}