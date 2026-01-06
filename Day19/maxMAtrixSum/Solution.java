class Solution {
    public static long maxMatrixSum(int[][] matrix) {
        long countNegative=0;
        long sum=0;
        long smallest=Integer.MAX_VALUE;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                sum+=Math.abs(matrix[i][j]);
                if(matrix[i][j]<0){
                    countNegative++;
                }
                smallest=Math.min(smallest,Math.abs(matrix[i][j]));
            }
        }
        if(countNegative%2==0){
            return sum;
        }
        return sum-(2*smallest);
    }
    public static void main(String arg[]){
        System.out.println(maxMatrixSum(new int[][]{{1,2,3},{-1,-2,-3},{1,2,3}}));
    }
}