class Solution {
 
    public boolean horizontal(int grid[][],long total){
         int m=grid.length;
        int n=grid[0].length;

        Set<Long> set=new HashSet<>();
        long top=0;
        for(int i=0;i<m-1;i++){
            for(int j=0;j<n;j++){
                top+=grid[i][j];
                set.add((long)grid[i][j]);
            }

            // true sutuation
            long bottom=total-top;
            long diff=top-bottom;
            if(diff==0) return true;
            if(grid[0][0]==diff || grid[0][n-1]==diff) return true;
            if(grid[i][0]==diff) return true;
            if(i>0 && n>1 && set.contains(diff)) return true;
        }

        return false;
    }
    public boolean canPartitionGrid(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
           Long total=0l;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                total+=grid[i][j];
            }
        }

        if(horizontal(grid,total)){
            return true;
        }

        //reverse ther grid
        reverse(grid);
        if(horizontal(grid,total)){
            return true;
        }
        reverse(grid);
        //verticla check

        int arr[][]=new int[n][m];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[j][i]=grid[i][j];
            }
        }
        if(horizontal(arr,total)){
            return true;
        }
        reverse(arr);
        if(horizontal(arr,total)){
            return true;
        }
        return false;
    }
    public void reverse(int grid[][]){
        int m=grid.length;
        int n=grid[0].length;
        for(int i=0;i<m/2;i++){
            for(int j=0;j<n;j++){
                int temp=grid[i][j];
                grid[i][j]=grid[m-i-1][j];
                grid[m-i-1][j]=temp;
            }
        }
    }
}