class Solution {
    public static int singleNonDuplicate(int[] nums) {
        int left=0, right=nums.length-1;
        while(left<right){
            int mid=left+(right-left)/2;
            boolean isEven=(right-mid)%2==0?true:false;
            if(nums[mid]==nums[mid+1]){
                if(isEven){
                    left=mid+2;
                }else{
                    right=mid-1;
                }
            }else{
                if(isEven){
                    right=mid;
                }else{
                    left=mid+1;
                }
            }
        }
        return nums[left];
    }
    public static void main(String arg[]){
        int nums[]={1,1,2,3,3,4,4,8,8};
        System.out.println(singleNonDuplicate(nums));
    }
}