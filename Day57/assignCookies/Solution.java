package Day57.assignCookies;
import java.util.*;
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int ans=0;
        Arrays.sort(g);
        Arrays.sort(s);

        int j=g.length-1,i=s.length-1;
        while(j>=0 && i>=0){
            if(g[j]<=s[i]){
                ans++;
                j--;
                i--;
            }else{
                j--;
            }
        }
        return ans;
    }
}
