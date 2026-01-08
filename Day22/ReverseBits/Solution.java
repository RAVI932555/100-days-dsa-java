class Solution {
    public static int reverseBits(int n) {
        int ans=0;
        for(int i=32;i>0;i--){
            if((n & 1)!=0){
                ans=ans | (1<<i-1);
            }
            n=n>>1;
        }
        return ans;
    }
    public static void main(String arg[]){
        System.out.println(reverseBits(43261596));
    }
}