import java.util.*;
class Solution {
    public static void setZeroes(int[][] matrix) {
        List<int[]> list=new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==0){
                    list.add(new int[]{i,j});
                }
            }
        }
        for(int i=0;i<list.size();i++){
            int arr[]=list.get(i);
            changed(matrix,arr[0],arr[1]);
        }
    }
    public static void changed(int matrix[][],int start,int end){
        for(int i=0;i<matrix.length;i++){
            matrix[i][end]=0;
        }
        for(int j=0;j<matrix[0].length;j++){
            matrix[start][j]=0;
        }
    }
    public static void main(String arg[]){
        int matrix[][]={{1,1,1},{1,0,1},{1,1,1}};
        setZeroes(matrix);
    }
}