import java.util.*;
class Solution {
    public static List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>>list=new ArrayList<>();
        List<Integer> ans=new ArrayList<>();
        Arrays.sort(nums);
        List<Integer> num=new ArrayList<>();
        for(int e:nums){
            num.add(e);
        }

        solve(num,nums.length,list,ans);
        return list;
    }
    public static void solve(List<Integer> num,int n,List<List<Integer>> list,List<Integer> ans){
        if(n==0){
            list.add(new ArrayList<>(ans));
            return ;
        }
        //kamm

        for(int i=0;i<num.size();i++){
            int val=num.get(i);
            ans.add(val);
            num.remove(i);
            solve(num,n-1,list,ans);
           num.add(i,val);
             ans.remove(ans.size()-1);
           while(i<num.size()-1 && num.get(i)==num.get(i+1)){
            i++;
           }
        }
    }
    public static void main(String arg[]){
        List<List<Integer>> list=permuteUnique(new int[]{1,2,3});
        for(int i=0;i<list.size();i++){
            for(int j=0;j<list.get(i).size();j++){
                System.out.print(list.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
}