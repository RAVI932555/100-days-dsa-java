import java.util.*;
class Solution {
    public static String minWindow(String s, String t) {
        int n=s.length();
        if(n<t.length()){
            return "";
        }
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int i=0,j=0;
        int minwindow=Integer.MAX_VALUE;
        int start_i=0;
        int requiredCount=t.length();
        while(j<n){
            char ch=s.charAt(j);
            if(map.containsKey(ch) && map.get(ch)>0) requiredCount--;
             map.put(ch,map.getOrDefault(ch,0)-1);
             while(requiredCount==0){
                int count=j-i+1;
                if(minwindow>count){
                    minwindow=count;
                    start_i=i;
                }
                char ch_i=s.charAt(i);
                map.put(ch_i,map.getOrDefault(ch_i,0)+1);
                if(map.containsKey(ch_i) && map.get(ch_i)>0) requiredCount++;
                i++;
             }
             j++;
        }
        return minwindow==Integer.MAX_VALUE?"":s.substring(start_i,start_i+minwindow);
    }
    public static void main(String arg[]){
        System.out.println(minWindow("ADOBECODEBANC","ABC"));
    }
}