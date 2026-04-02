package Day92.ArrangesCoins;

class Solution {
    public int arrangeCoins(int n) {
        int start=1;
        int end=n;
        while(start<=end){
            long mid=start+(end-start)/2;
            long add=(mid *(mid+1))/2;
            if(add==n){
                return (int)mid;
            }else if(add<n){
                start=(int)mid+1;
            }else{
                end=(int)mid-1;
            }
        }
        return start-1;
    }
}
