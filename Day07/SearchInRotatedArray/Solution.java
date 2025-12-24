class Solution {
    public static int search(int[] nums, int target) {
       int started=rotated(nums);
       if(target>=nums[started] && nums[nums.length-1]>=target) return searched(nums,started,nums.length-1,target);
       else return searched(nums,0,started-1,target);
       
    }
    public static int searched(int nums[],int i,int j,int target){
        while(i<=j){
             int mid=i+(j-i)/2;
            if(nums[mid]==target) return mid;
            else if(nums[mid]>target) j=mid-1;
            else i=mid+1;
        }
           
        return -1;
    }
    public static int rotated(int nums[]){
        int start=0;
        int end=nums.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
           if(nums[mid]>nums[end]) start=mid+1;
           else end=mid;
        }
        return start;
    }
    public static void main(String arg[]){
        int arr[]={4,5,6,7,0,1,2};
        System.out.println(search(arr,0));
    }
}