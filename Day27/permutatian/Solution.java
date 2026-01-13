import java.util.*;
class Solution {
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> ans=new ArrayList<>();
        List<Integer> num=new ArrayList<>();
        for(int val:nums){
            num.add(val);
        }
        solve(nums.length,num,ans,list);
        return list;
    }
    public static void solve(int n,List<Integer> num,List<Integer> list,List<List<Integer>> ans){
        if(n==0){
            ans.add(new ArrayList<>(list));
            return ;
        }
        for(int i=0;i<num.size();i++){
            int val=num.get(i);
            list.add(val);
            num.remove(i);
            solve(n-1,num,list,ans);
            num.add(i,val);
            list.remove(list.size()-1);
        }
    }
    public static void main(String arg[]){
        List<List<Integer>> ans=permute(new int[]{1,2,3});
        // for(int i=0;i<ans.size();i++){
        //     List<Integer> temp=ans.get(i);
        //     for(int j=0;temp.size();j++){
        //         System.out.print(ans.get(i).get(j));
        //     }
        //     System.out.println();
        // }
    }
}