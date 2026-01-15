import java.util.*;
class Solution {
    private static Set<List<Integer>> temp=new HashSet<>();
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        //kaam
        List<Integer> list=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        solve(0,target,candidates,list,ans);
        return ans;
    }
    public static void solve(int index,int target,int nums[],List<Integer> list,List<List<Integer>> ans){
        //base
        if(index==nums.length || target<0){
            return;
        }
        if(target==0){
            if(!temp.contains(list)){
                 ans.add(new ArrayList<>(list));
                 temp.add(list);
            }
           
            return;
        }
        //kkam
        list.add(nums[index]);
        solve(index+1,target-nums[index],nums,list,ans);
        solve(index,target-nums[index],nums,list,ans);
        list.remove(list.size()-1);
        solve(index+1,target,nums,list,ans);
    }
    public static void main(String arg[]){
        List<List<Integer>> sol=combinationSum(new int[]{2,3,4,5},7);
    }
}