class Solution {
    private static int factorial(int n){
        int sum=0;
        int count=0;
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                int j=n/i;
                if(j==i || count >0) return 0;
                sum+=i+j;
                count++;
            }
        }
        if(count==0) return 0;
        return 1+sum+n;
    }
    public static int sumFourDivisors(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=factorial(nums[i]);
        }
        return sum;
    }
    public static void main(String arg[]){
        System.out.println(sumFourDivisors(new int[]{21,4,7}));
    }
}