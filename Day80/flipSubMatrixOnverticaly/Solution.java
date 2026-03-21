class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
       for(int i=x;i<x+k/2;i++){
        int m = x + k - 1 - (i - x);
        for(int j=y;j<k+y;j++){
            int temp=grid[i][j];
            grid[i][j]=grid[m][j];
            grid[m][j]=temp;
        }
       }
       return grid;
    }
}