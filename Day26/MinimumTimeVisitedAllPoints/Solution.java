class Solution {
    public static int minTimeToVisitAllPoints(int[][] points) {
        int ans=0;
        for(int i=1;i<points.length;i++){
            int first=points[i][0]-points[i-1][0];
            int second=points[i][1]-points[i-1][1];
            first=Math.abs(first);
            second=Math.abs(second);
            ans=second>first?ans+second:ans+first;
        }
        return ans;
    }
    public static void main(String arg[]){
        System.out.println(minTimeToVisitAllPoints(new int[][]{{1,1},{3,4},{-1,0}}));
    }
}