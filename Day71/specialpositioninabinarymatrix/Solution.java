class Solution {
    public int numSpecial(int[][] mat) {
        int pow=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                if(mat[i][j]==1){
                    boolean finder=oneGet(mat,i,j);
                    if(finder){
                        pow++;
                    }
                    break;
                }
            }
        }
        return pow;
    }
    public boolean oneGet(int mat[][],int i,int j){
        //top
        for(int top=i-1;top>=0;top--){
            if(mat[top][j]==1){
                return false;
            }
        }
        for(int bott=i+1;bott<mat.length;bott++){
            if(mat[bott][j]==1){
                return false;
            }
        }
        for(int left=j-1;left>=0;left--){
            if(mat[i][left]==1){
                return false;
            }
        }
        for(int right=j+1;right<mat[i].length;right++){
            if(mat[i][right]==1){
                return false;
            }
        }
        return true;
    }
}