class Solution {
    public static int singleNumber(int[] nums) {
       int result=0;
       for(int k=0;k<=31;k++){
        int countOne=0;
        int countZero=0;
        int temp=1<<k;
        for(int i=0;i<nums.length;i++){
            if((nums[i] & temp)==0){
                countZero++;
            }else{
                countOne++;
            }
        }
        if(countOne%3==1){
            result=(result | temp);
        }
       }
       return result;
    }
    public static void main(String arg[]){
        System.out.println(singleNumber(new int[]{0,1,0,1,0,1,99}));
    }
}