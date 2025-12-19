class Solution {
    public static int[] findMissingAndRepeatedValues(int[][] grid) {
     int size=grid.length;
     int count[]=new int[size*size+1];
     for(int i=0;i<grid.length;i++){
        for(int j=0;j<grid[i].length;j++){
            count[grid[i][j]]++;
        }
     }
     int repeaded=0;
     int missed=0;
     for(int i=1;i<count.length;i++){
        if(count[i]==0){         
               missed=i;
        }
        if(count[i]>1){
            repeaded=i;
        }
     }
     return new int[]{repeaded,missed};
    }
    public static void main(String arg[]){
        int [][] grid={{1,3},{2,2}};
        int []arr=findMissingAndRepeatedValues(grid);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}