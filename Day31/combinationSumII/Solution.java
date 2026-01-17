class Solution {
    private Set<List<Integer>> temp=new HashSet<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> ans=new ArrayList<>();
        Arrays.sort(candidates);
        solve(0,target,candidates,list,ans);
        return list;
    }
    public void solve(int index,int target,int nums[],List<List<Integer>> list,List<Integer> ans){
    //kaam
    if(target==0){
        list.add(new ArrayList<>(ans));
        return;
    }
    if(target<0){
        return;
    }
    for(int i=index;i<nums.length;i++){
        if(i>index && nums[i]==nums[i-1]){
            continue;
        }
        if(nums[i]>target){
            break;
        }
        ans.add(nums[i]);
        solve(i+1,target-nums[i],nums,list,ans);
        ans.remove(ans.size()-1);
    }
    }
}