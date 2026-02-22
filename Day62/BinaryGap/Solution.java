package Day62.BinaryGap;

class Solution {
    public int binaryGap(int n) {
        StringBuilder str=new StringBuilder("");
        while(n>0){
            int num=n;
            if((n & 1)!=0){
                str.append("1");
            }else{
                str.append("0");
            }
            n=n>>1;
        }
        int largest=0;
        int i=-1,j=0;
        while(j<str.length()){
            if(str.charAt(j)=='1'){
                if(i==-1){
                    i=j;
                }else{
                    largest=Math.max(largest,j-i);
                    i=j;
                }
            }
            j++;
        }
        return largest;
    }
}