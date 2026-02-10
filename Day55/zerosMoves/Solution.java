package Day55.zerosMoves;

class Solution {
    public void moveZeroes(int[] nums) {
        int indx=0;
        int i=0;
        while(indx<nums.length){
            if(nums[indx]!=0){
                nums[i]=nums[indx];
                i++;
            }
            indx++;
        }
        for(int j=i;j<nums.length;j++){
            nums[j]=0;
        }
    }
}
