class Solution {
    public static boolean isPowerOfTwo(int n) {
        return n>0 && (n & (n-1))==0;
    }
    public static void main(String arg[]){
        System.out.println(isPowerOfTwo(16));
    }
}