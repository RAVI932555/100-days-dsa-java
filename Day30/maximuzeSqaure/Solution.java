import java.util.*;
class Solution {
    public static int maximizeSquareArea(int m, int n, int[] hFences, int[] vFences) {
        List<Integer> hlist=new ArrayList<>();
        hlist.add(1);
        hlist.add(m);
        for(int i:hFences){
            hlist.add(i);
        }
        List<Integer> vlist=new ArrayList<>();
        for(int i:vFences){
            vlist.add(i);
        }
        vlist.add(1);
        vlist.add(n);
        int ans=0;
        Collections.sort(hlist);
        Collections.sort(vlist);

        Set<Integer> width=new HashSet<>();
        for(int i=0;i<vlist.size();i++){
            for(int j=i+1;j<vlist.size();j++){
                int w=vlist.get(j)-vlist.get(i);
                width.add(w);
            }
        }
        for(int i=0;i<hlist.size();i++){
            for(int j=i+1;j<hlist.size();j++){
                int height=hlist.get(j)-hlist.get(i);
                if(width.contains(height)){
                    ans=Math.max(ans,height);
                }
            }
        }
        long mod=(long)Math.pow(10,9)+7;
        return ans==0?-1:(int)((1L* ans*ans)%mod);
    }
    public static void main(String arg[]){
        System.out.println(maximizeSquareArea(3,4,new int[]{2,3},new int[]{2}));
    }
}