package Day79.MinimumAbsoluteDifferenceinSlidingSubmatrix;
import java.util.*;
class Solution {
    public int[][] minAbsDiff(int[][] grid, int k) {
        List<List<Integer>> list=new ArrayList<>();
        int m=grid.length;
        int n=grid[0].length;
        for(int i=0;i<m-k+1;i++){
            List<Integer> l=new ArrayList<>();
            for(int j=0;j<n-k+1;j++){
                int value=subAns(grid,i,j,k);
                l.add(value);
            }
            list.add(l);
        }
        int arr[][]=list.stream().map(l -> l.stream().mapToInt(i -> i).toArray())
            .toArray(int[][]::new);
            return arr;
    }
    public int subAns(int grid[][],int starti,int startj,int k){
        List<Integer> list=new ArrayList<>();
        for(int i=starti;i<k+starti;i++){
            for(int j=startj;j<startj+k;j++){
                list.add(grid[i][j]);
            }
        }
        Collections.sort(list);
        int i=0,j=list.size()-1;
        if(list.get(i)==list.get(j)){
            return 0;
        }
        int min=Integer.MAX_VALUE;
       for(k=0;k<list.size()-1;k++){
        for(int l=k+1;l<list.size();l++){
                int value=Math.abs(list.get(k)-list.get(l));
                if(value==0){
                    continue;
                }
                min=value<min?value:min;
        }
       }
       return min;
    }
}
