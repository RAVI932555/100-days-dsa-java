package Day58.summaryRanges;

class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list=new ArrayList<>();
        int i=0;
        while(i<nums.length){
            int start=nums[i];
            while(i<nums.length-1 && nums[i]+1==nums[i+1]){
                i++;
            }
            if(start==nums[i]){
                list.add(""+start);
            }else{
                 list.add(start+"->"+nums[i]);
            }
           
            i++;
        }
        return list;
    }
}
