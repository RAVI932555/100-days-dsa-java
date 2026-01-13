import java.util.*;
class Solution {
    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> ans=new ArrayList<>();
        Arrays.sort(nums);
        solve(0,nums,list,ans);
        return list;
    }
    public static void solve(int i,int nums[],List<List<Integer>> list,List<Integer> ans){
        if(i==nums.length){
            list.add(new ArrayList<>(ans));
            return ;
        }
        //kam
        ans.add(nums[i]);
        solve(i+1,nums,list,ans);
        ans.remove(ans.size()-1);
        while(i+1<nums.length && nums[i]==nums[i+1]){
            i++;
        }
        solve(i+1,nums,list,ans);

    }
    public static void main(String arg[]){
        List<List<Integer>> list=subsetsWithDup(new int[]{1,2,3});

    }
}