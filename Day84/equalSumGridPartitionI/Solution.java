class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        long sum=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                sum+=grid[i][j];
            }
        }
        //check vertically 
        long add=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                add+=grid[i][j];
            }
            if((sum-add)==add){
                return true;
            }
            if((sum-add)<add){
                break;
            }
        }
        //horizontial 
         add=0;
        for(int j=0;j<grid[0].length;j++){
            for(int i=0;i<grid.length;i++){
               add+=grid[i][j]; 
            }
            if((sum-add)==add){
                return true;
            }
            if((sum-add)<add){
                break;
            }
        }
        return false;
    }
}