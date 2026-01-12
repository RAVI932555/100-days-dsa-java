import java.util.*;
class Solution {
    public static int totalNQueens(int n) {
        int count=0;
        char board[][]=new char[n][n];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
        int ans=nqueen(board,count,0);
        return ans;
    }
    public static int nqueen(char board[][],int count,int row){
        //if base 
        if(row==board.length){
            count+=1;
            return count;
        }

        for(int j=0;j<board.length;j++){
            if(isSafe(board,row,j)){
                board[row][j]='Q';
                count=nqueen(board,count,row+1);
                board[row][j]='.';
            }

        }
        return count;
    }
    public static boolean isSafe(char board[][],int row,int col){
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        for(int i=row-1, j=col-1;i>=0 && j>=0 ;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        for(int i=row-1, j=col+1;i>=0 && j<board.length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
    public static void main(String arg[]){
        System.out.println(totalNQueens(4));
    }
}