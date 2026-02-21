class Solution {
    public int countPrimeSetBits(int left, int right) {
        int ans=0;
        for(int i=left;i<=right;i++){
            int count=numberOfBit(i);
            ans=isPrime(count)?ans+1:ans;
        }
        return ans;
    }
    public int numberOfBit(int n){
        int num=n;
        int count=0;
        while(n>0){
            num=n;
            if((num & 1)!=0){
                count++;
            }
            n=n>>1;
        }
        return count;
    }
    public boolean isPrime(int n){
        if(n==1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}