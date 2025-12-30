class Solution {
    public static int[] twoSum(int[] numbers, int target) {
        int first=0;
        int second=numbers.length-1;
        while(first<second){
            int sum=numbers[first]+numbers[second];
            if(sum==target){
                return new int[]{first+1,second+1};
            }else if(sum>target){
                second--;
            }else{
                first++;
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String arg[]){
        int nums[]={2,7,11,15};
        int arr[]=twoSum(nums,9);
    }
}