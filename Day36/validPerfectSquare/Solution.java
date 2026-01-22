class Solution {
    public static boolean isPerfectSquare(int num) {
        if(num==1){
            return true;
        }
        int left=0;
        int right=num;
        while(left<=right){
            int mid=left+(right-left)/2;
            long sq=(long)mid*(long)mid;
            if(sq==num){
                return true;
            }else if(sq>num){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return false;
    }
    public static void main(String arg[]){
        System.out.println(isPerfectSquare(16));
    }
}