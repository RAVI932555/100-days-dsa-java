class Solution {
    int mod=1000000007;
    public int xorAfterQueries(int[] nums, int[][] queries) {
        int length=queries.length;
        for(int i=0;i<length;i++){
            int l=queries[i][0];
            int r=queries[i][1];
            int step=queries[i][2];
            int num=queries[i][3];

            for(int j=l;j<=r;j+=step){
                long val=(1L * nums[j] * num)%mod;
                nums[j]=(int) val;
            }
        }
        int ans=nums[0];
        for(int i=1;i<nums.length;i++){
            ans=ans^nums[i];
        }
        return ans;
    }
}