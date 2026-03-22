class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        for(int i=0;i<4;i++){
            boolean equal=true;
            for(int j=0;j<mat.length;j++){
                for(int k=0;k<mat.length;k++){
                    if(mat[j][k]!=target[j][k]){
                        equal=false;
                        break;
                    }
                }
                if(!equal){
                    break;
                }
            }
            if(equal){
                return true;
            }
            rotated(mat);
        }
        return false;
    }
    public void rotated(int mat[][]){
        //transforsation 
        for(int i=0;i<mat.length;i++){
            for(int j=i;j<mat.length;j++){
                int temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        }
        for(int i=0;i<mat.length;i++){
            int st=0;
            int ed=mat.length-1;
            while(st<ed){
                int temp=mat[i][st];
                mat[i][st]=mat[i][ed];
                mat[i][ed]=temp;
                st++;
                ed--;
            }
        }
    }
}