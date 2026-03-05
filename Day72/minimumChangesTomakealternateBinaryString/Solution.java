class Solution {
    public int minOperations(String s) {
        int next_with_1=0;//01010101
        int next_with_0=0;//10101010
        for(int i=0;i<s.length();i++){
            if(i%2==0){
                if(s.charAt(i)=='1'){
                    next_with_1++;
                }else{
                    next_with_0++;
                }
            }else{
                if(s.charAt(i)=='0'){
                    next_with_1++;
                }else{
                    next_with_0++;
                }
            }
        }
        return Math.min(next_with_1,next_with_0);
    }
}