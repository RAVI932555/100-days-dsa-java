import java.util.*;
class Solution {
    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)-> Integer.compare(a[0],b[0]));
        List<List<Integer>> list=new ArrayList<>();
        int start=intervals[0][0];
        int end=intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            if(end>=intervals[i][0]){
                end=Math.max(end,intervals[i][1]);
            }else{
                list.add(Arrays.asList(start,end));
                start=intervals[i][0];
                end=intervals[i][1];
            }  
        }
         list.add(Arrays.asList(start,end));
        int arr[][]=new int[list.size()][2];
        for(int i=0;i<list.size();i++){
            arr[i][0]=list.get(i).get(0);
            arr[i][1]=list.get(i).get(1);
        }
        return arr;
    }
    public static void main(String arg[]){
        int[][] merge={{1,3},{3,6},{8,10},{12,15}};
        int ans[][]=merge(merge);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i][0]+" "+ans[i][1] +"    ");
        }
    }
}