class Solution {
    public static int[] sortArray(int[] nums) {
        mergeSort(nums,0,nums.length-1);
        return nums;
    }
    public static void mergeSort(int nums[],int si,int ei){
        if(si>=ei){
            return;
        }
        int mid=si+(ei-si)/2;
        mergeSort(nums,si,mid);
        mergeSort(nums,mid+1,ei);
        merge(nums,si,mid,ei);
    }
    public static void merge(int nums[],int si,int mid,int ei){
        int arr[]=new int[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;
        while(i<=mid && j<=ei){
            if(nums[i]<nums[j]){
                arr[k]=nums[i];
                i++;
            }else{
                arr[k]=nums[j];
                j++;
            }
            k++;
        }
        while(j<=ei){
            arr[k++]=nums[j++];
        }
        while(i<=mid){
            arr[k++]=nums[i++];
        }
        for(k=0,i=si;k<arr.length;i++,k++){
            nums[i]=arr[k];
        }
    }
    public static void main(String arg[]){
        int arr[]=sortArray(new int[]{2,4,3,5});
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}