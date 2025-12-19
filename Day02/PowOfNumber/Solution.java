class Solution {
    public static double myPow(double x, int n) {
        long binForm=n;
        double ans=1;
        if(binForm<0){
            x=1/x;
            binForm=binForm*-1;
        }
        while(binForm>0){
            if(binForm%2==1){
                ans=ans*x;
                
            }
            x=x*x;
            binForm=binForm/2;
        }
        return ans;
    }
    public static void main(String arg[]){
        System.out.println(myPow(2,10));
    }
}