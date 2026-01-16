import java.util.*;
class Solution {
    public static int maximizeSquareHoleArea(int n, int m, int[] hBars, int[] vBars) {
        Arrays.sort(hBars);
        Arrays.sort(vBars);

        int maxconsqutivevBar=1;
        int maxconsqutivehBar=1;
        int currconsqutivevBar=1;
        for(int i=1;i<vBars.length;i++){
            if(vBars[i]-vBars[i-1]==1){
                currconsqutivevBar++;
            }else{
                currconsqutivevBar=1;
            }
            maxconsqutivevBar=Math.max(maxconsqutivevBar,currconsqutivevBar);
        }
        int currconsqutivehBar=1;
        for(int i=1;i<hBars.length;i++){
            if(hBars[i]-hBars[i-1]==1){
                currconsqutivehBar++;
            }else{
                currconsqutivehBar=1;
            }
            maxconsqutivehBar=Math.max(maxconsqutivehBar,currconsqutivehBar);
        }
        int ans=Math.min(maxconsqutivehBar,maxconsqutivevBar)+1;
        return ans*ans;
    }
     public static void main(String arg[]){
        System.out.println(maximizeSquareHoleArea(3,4,new int[]{2,3},new int[]{2}));
    }
}