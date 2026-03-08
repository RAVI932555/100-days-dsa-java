class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        HashSet<Integer> list=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            list.add(nums[i]);   
        }
        for(int i=1;i<nums.length+1;i++){
            if(!list.contains(i)){
                ans.add(i);
            }
        }
        return ans;
    }
}
