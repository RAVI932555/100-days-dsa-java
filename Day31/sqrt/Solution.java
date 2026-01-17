class Solution {
    public static int mySqrt(int x) {
        if(x>=1 && x<4){
            return 1;
        }
        int ans=0;
        for(int i=2;i<x;i++){
            if((1L*i*i)<=x){
                ans=i;
            }else{
                break;
            }
        }
        return ans;
    }
    public static void main(String arg[]){
        System.out.println(mySqrt(4));
    }
}