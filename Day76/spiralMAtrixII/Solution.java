class Solution {
    public int[][] generateMatrix(int n) {
        int arr[][]=new int[n][n];
        int nums=1;
        int col=0;
        int row=0;
        int erow=n-1;
        int ecol=n-1;
        while(row<=erow && col<=ecol){
            for(int i=col;i<=ecol;i++){
                arr[row][i]=nums;
                nums++;
            }
            for(int i=row+1;i<=erow;i++){
                arr[i][ecol]=nums;
                nums++;
            }
            for(int i=ecol-1;i>=col;i--){
                if(col==ecol){
                    break;
                }
                arr[erow][i]=nums;
                nums++;
            }
            for(int i=erow-1;i>=row+1;i--){
                if(row==erow){
                    break;
                }
                arr[i][col]=nums;
                nums++;
            }
            row++;
            col++;
            erow--;
            ecol--;
        }
        return arr;
    }
}