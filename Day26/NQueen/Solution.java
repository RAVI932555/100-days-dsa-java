import java.util.*;
class Solution {
    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> list=new ArrayList<>();
        char board[][]=new char[n][n];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                board[i][j]='.';
            }
        }
        solve(board,0,list);
        return list;
    }
    public static void solve(char board[][],int row,List<List<String>> list){
        if(row==board.length){
            charTostring(board,list);
            return;
        }
        for(int i=0;i<board.length;i++){
            if(isSafe(board,row,i)){
                board[row][i]='Q';
                solve(board,row+1,list);
                board[row][i]='.';
            }
        }
    }
    public static boolean isSafe(char board[][],int row,int col){
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        for(int i=row-1,j=col-1;i>=0 && j>=0 ; i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
    public static void charTostring(char board[][],List<List<String>> list){
        List<String> li=new ArrayList<>();

        for(int i=0;i<board.length;i++){
            StringBuilder str=new StringBuilder("");
            for(int j=0;j<board.length;j++){
                str.append(board[i][j]);
            }
            li.add(str.toString());
        }
        list.add(li);
    }
    public static void main(String arg[]){
        List<List<String>> list=solveNQueens(4);
        for(int i=0;i<list.size();i++){
            for(int j=0;j<list.get(i).size();j++){
                System.out.println(list.get(i).get(j)+" ");
            }
            System.out.println("-------------");
        }
    }
}