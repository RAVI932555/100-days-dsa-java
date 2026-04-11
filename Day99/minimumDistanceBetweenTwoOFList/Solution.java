class Solution {
    public int minimumDistance(int[] nums) {
        int arr[][]=new int[nums.length][2];
        for(int i=0;i<nums.length;i++){
            arr[i][0]=nums[i];
            arr[i][1]=i;
        }
        Arrays.sort(arr,(a,b)->a[0]-b[0]);
        int ans=Integer.MAX_VALUE;
        for(int i=2;i<nums.length;i++){
            if(arr[i-2][0]==arr[i][0] && arr[i][0]==arr[i-1][0]){
                int first=arr[i][1];
                int second=arr[i-2][1];
                int thrid=arr[i-1][1];

                // find the largest and smallest 
                int j=Math.min(first,Math.min(second,thrid));
                int k=Math.max(first,Math.max(thrid,second));
                ans=Math.min(ans,(2* (k-j)));
            }
        }
        return ans==Integer.MAX_VALUE?-1:ans;
    }
}