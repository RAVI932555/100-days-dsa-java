class Solution {
    public int[] searchRange(int[] nums, int target) {
      int first=search(nums,target,true);
      int second=search(nums,target,false);
      return new int[]{first,second};
    }
    public int search(int []nums,int target,boolean first){
        int si=0;
        int ans=-1;
        int ei=nums.length-1;
        while(si<=ei){
            int mid=si+(ei-si)/2;
            if(nums[mid]>target){
                ei=mid-1;
            }else if(nums[mid]<target){
                si=mid+1;
            }else{
                if(first){
                    ans=mid;
                    ei=mid-1;
                }else{
                    ans=mid;
                    si=mid+1;
                }
            }
        }
        return ans;
    }
}