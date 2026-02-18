package Day59.binaryNumberOfalternativeBits;

class Solution {
    public boolean hasAlternatingBits(int n) {
        int val=0;
        int number=n;
        if((number & 1)!=0){
            val=1;
        }
        n=n>>1;
        while(n>0){
            number=n;
            if((val==1 && (number & 1)!=0) || (val==0 && (number & 1)==0)){
                return false;
            }
            if((number & 1)!=0){
                val=1;
            }else{
                val=0;
            }
            n=n>>1;
        }
        return true;
    }
}
