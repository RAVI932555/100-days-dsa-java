class Solution {
    public static boolean checkValidGrid(int[][] grid) {
        return solve(grid,0,0,0);
    }
    public static boolean solve(int [][] grid,int row,int col,int count){
        if(row<0 || col<0 || row>grid.length-1 || col>grid.length-1 || grid[row][col]!=count){
            return false;
        }
        if(count==(Math.pow(grid.length,2)-1)){
            return true;
        }
       boolean ans1=solve(grid,row-2,col+1,count+1);
       boolean ans2=solve(grid,row-1,col+2,count+1);
       boolean ans3=solve(grid,row+1,col+2,count+1);
       boolean ans4=solve(grid,row+2,col+1,count+1);
       boolean ans5=solve(grid,row+2,col-1,count+1);
       boolean ans6=solve(grid,row+1,col-2,count+1);
       boolean ans7=solve(grid,row-1,col-2,count+1);
       boolean ans8=solve(grid,row-2,col-1,count+1);
       return ans1|| ans2 || ans3 || ans4 || ans4 || ans5 || ans6 || ans7 || ans8;
    }
    public static void main(String arg[]){
        int grid[][]={{0,11,16,5,20},{17,4,19,10,15},{12,1,8,21,6},{3,18,23,14,9},{24,13,2,7,22}};
        System.out.println(checkValidGrid(grid));
    }
}