class Solution {
    public boolean areSimilar(int[][] mat, int k) {
        k=k%mat[0].length;
        if(k==0){
            return true;
        }
        int temp[][]=new int[mat.length][mat[0].length];
        for(int i=0;i<mat.length;i++){
            
            for(int j=mat[i].length-1;j>=0;j--){
                int indx=(mat[i].length+j-k)%mat[0].length;
                temp[i][indx]=mat[i][j];
            }
        }
        //check 
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
               
                if(temp[i][j]!=mat[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
}