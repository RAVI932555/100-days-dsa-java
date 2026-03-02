class Solution {
    public int minSwaps(int[][] grid) {
        int step=0;
        int arr[]=new int[grid.length];
        for(int i=0;i<grid.length;i++){
            int j=grid.length-1;
            int count=0;
            while(j>=0 && grid[i][j]==0){
                count++;
                j--;
            }
            arr[i]=count;
        }
        for(int i=0;i<arr.length;i++){
            int need=grid.length-i-1;
            int j=i;
            while(j<grid.length && arr[j]<need){
                j++;
            }
            if(j==grid.length){
                return -1;
            }
            step+=j-i;
            while(j>i){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
        return step;
    }
}