
class Solution {
    public int numberOfSubmatrices(char[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int cumsumX[][]=new int[m][n];
        int cumsumY[][]=new int[m][n];
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                cumsumX[i][j]=grid[i][j]=='X'?1:0;
                cumsumY[i][j]=grid[i][j]=='Y'?1:0;

                if(i-1>=0){
                    cumsumX[i][j]+=cumsumX[i-1][j];
                    cumsumY[i][j]+=cumsumY[i-1][j];
                }
                if(j-1>=0){
                    cumsumX[i][j]+=cumsumX[i][j-1];
                    cumsumY[i][j]+=cumsumY[i][j-1];
                }
                if(j>0 && i>0){
                    cumsumX[i][j]-=cumsumX[i-1][j-1];
                    cumsumY[i][j]-=cumsumY[i-1][j-1];
                }
                if(cumsumX[i][j]>0 && cumsumX[i][j]==cumsumY[i][j]){
                    count++;
                }
            }
        }
        return count;
    }
}