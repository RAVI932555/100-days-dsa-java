
class Solution {
    public static int[] productExceptSelf(int[] nums) {
        int arr[]=new int[nums.length];
        //find left product
        arr[0]=1;
        for(int i=1;i<arr.length;i++){
            arr[i]=arr[i-1]*nums[i-1];
        }
        //find the result
        int product=1;
        for(int i=nums.length-1;i>=0;i--){
            arr[i]=arr[i]*product;
            product=product*nums[i];
        }
        return arr;
    }
    public static void main(String arg[]){
        int nums[]={1,2,3,4};
        int arr[]=productExceptSelf(nums);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}