import java.util.*;
class Solution {
    public static long maximumHappinessSum(int[] happiness, int k) {
        long sum=0;
        int n=happiness.length;
        int count=0;
        Arrays.sort(happiness);
        for(int i=n-1;i>=0;i--){
            if(k>0 && (happiness[i]-count)>=0){
                sum+=happiness[i]-count;
                count++;
                k--;
            }else{
                break;
            }
        }
        return sum;
    }
    public static void main(String arg[]){
        int num[]={1,2,3};
        System.out.println(maximumHappinessSum(num,2));
    }
}