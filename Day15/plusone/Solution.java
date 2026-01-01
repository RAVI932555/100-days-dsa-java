class Solution {
    public static int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--){
            digits[i]++;
            if(digits[i]<10) return digits;
            digits[i]=0;
        }
        digits=new int[digits.length+1];
        digits[0]=1;
        return digits;
    }
    public static void main(String arg[]){
        int arr[]=plusOne(new int[]{4,3,2,1});
    }
}