class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
       int arr[][]=new int[mat.length][2];
        for(int i=0;i<mat.length;i++){
            int number=0;
            for(int j=0;j<mat[i].length;j++){
                if(mat[i][j]==1){
                    number++;
                }
            }
            arr[i][0]=i;
            arr[i][1]=number;
        }
       Arrays.sort(arr, Comparator.comparingInt((int[] a) -> a[1])
                            .thenComparingInt(a -> a[0]));

        int ans[]=new int[k];
        for(int i=0;i<ans.length;i++){
            ans[i]=arr[i][0];
        }
        return ans;
    }
}