class Solution {
    public static boolean isMonotonic(int[] nums) {
       boolean res = true;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] < nums[i - 1]){
                res = false;
                break;
            }
        }
        if(res){
            return res;
        }
        for(int i = 1; i < nums.length; i++){
            if(nums[i] > nums[i - 1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String arg[]){
        System.out.println(isMonotonic(new int[]{1,2,3}));
    }
}