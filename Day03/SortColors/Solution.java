class Solution {
    public static void sortColors(int[] nums) {
        int zero=0;
        int one=0;
        int two=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) zero++;
            else if(nums[i]==1) one++;
            else two++;
        }
        for(int i=0;i<nums.length;i++){
           if(zero>0){
            nums[i]=0;
            zero--;
           }else if(one>0){
            nums[i]=1;
            one--;
           }else{
            nums[i]=2;
            two--;
           }
        }
    }
     public static void main(String arg[]){
       int nums[]={1,2,0,2,0,1,2,0,1,2};
       sortColors(nums);
       for(int i=0;i<nums.length;i++){
        System.out.print(nums[i]+" ");
       }
       
    }
}