class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int result[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int index=Math.abs(nums[i]);
            if(nums[i]<0){
                int idx=i;
                while(index>0){
                    idx-=1;
                    index--;
                    if(idx<0){
                        idx=nums.length-1;
                    }
                }
                result[i]=nums[idx];
            }else{
                 int idx=i;
                while(index>0){
                    idx++;
                    index--;
                    if(idx==nums.length){
                        idx=0;
                    }
                }
                result[i]=nums[idx];
            }
        }
        return result;
    }
}