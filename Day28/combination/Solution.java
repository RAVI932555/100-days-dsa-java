import java.util.*;
class Solution {
    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
       
        solve(n,k,1,ans,list);
        return ans;
    }
    public static void solve(int n,int k,int start,List<List<Integer>> ans,List<Integer> list){
        if(list.size()==k){
            ans.add(new ArrayList<>(list));
            return;
        }
        //kkam
        for(int i=start;i<=n;i++){
            list.add(i);
            solve(n,k,i+1,ans,list);
            list.remove(list.size()-1);
        }
        
    }
    public static void main(String arg[]){
        List<List<Integer>> list=combine(4,2);
        for(int i=0;i<list.size();i++){
            for(int j=0;j<list.get(i).size();j++){
                System.out.print(list.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
}