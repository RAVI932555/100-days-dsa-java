package Day64.sortIntegerByNumberOfBits;

class Solution {
    public int[] sortByBits(int[] arr) {
        int ans[][]=new int[arr.length][2];
        for(int i=0;i<arr.length;i++){
            ans[i][0]=arr[i];
            ans[i][1]=numberOfOne(arr[i]);
        }
        Arrays.sort(ans, Comparator
                .comparingInt((int[] a) -> a[1])
                .thenComparingInt(a -> a[0]));
        for(int i=0;i<arr.length;i++){
            arr[i]=ans[i][0];
            System.out.println(ans[i][1]);
        }
        return arr;
    }
    public int numberOfOne(int n){
        int count=0;
        while(n>0){
            if((n & 1)!=0){
                count++;
            }
            n=n>>1;
        }
        return count;
    }
}