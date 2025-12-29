class Solution {
    public static int peakIndexInMountainArray(int[] arr) {
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(mid<arr.length && arr[mid]>arr[mid+1]){
                end=mid;
            }else{
                start=mid+1;
            }
        }
        return start;
    }
    public static void main(String arg[]){
        int arr[]={0,1,10,5,2};
        System.out.println(peakIndexInMountainArray(arr));
    }
}