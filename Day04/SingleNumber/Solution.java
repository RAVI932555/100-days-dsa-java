class Solution {
    public static int singleNumber(int[] nums) {
        int result=0;
        for(int i=0;i<nums.length;i++){
            result^=nums[i];
        }
        return result;
    }
    public static void main(String arg[]){
        int nums[]={1,2,1,4,2};
        System.out.println(singleNumber(nums));
    }
}