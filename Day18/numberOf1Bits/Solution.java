class Solution {
    public static int hammingWeight(int n) {
       int count=0;
       while(n!=0){
        count=count+(n&1);
        n=n>>>1;
       }
       return count;
    }
    public static void main(String arg[]){
        System.out.println(hammingWeight(11));
    }
}